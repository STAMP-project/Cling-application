import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray21);
        boolean boolean40 = nativeArray21.isSealed();
        com.google.javascript.rhino.head.Scriptable scriptable41 = nativeArray21.getPrototype();
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray46, "", (java.lang.Object) 100);
        java.lang.Object obj50 = nativeArray43.associateValue((java.lang.Object) ' ', (java.lang.Object) nativeArray46);
        java.lang.Object[] objArray51 = nativeArray46.toArray();
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray46, "");
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray59 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray56.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray59, (java.lang.Object) (-1));
        boolean boolean63 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray59, "");
        com.google.javascript.rhino.head.NativeArray nativeArray66 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int68 = nativeArray66.lastIndexOf((java.lang.Object) (short) 10);
        long long69 = nativeArray66.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray66, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray74 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray77 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray74.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray77, (java.lang.Object) (-1));
        java.lang.Object[] objArray80 = nativeArray74.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable81 = nativeArray74.getParentScope();
        boolean boolean82 = nativeArray66.containsAll((java.util.Collection) nativeArray74);
        com.google.javascript.rhino.head.Scriptable scriptable83 = nativeArray74.getParentScope();
        boolean boolean84 = nativeArray74.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray87 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable88 = nativeArray87.getParentScope();
        java.lang.Object[] objArray89 = nativeArray87.getIds();
        boolean boolean90 = nativeArray74.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray87);
        java.lang.reflect.Method method91 = null;
        java.lang.reflect.Method method92 = null;
        nativeArray59.defineProperty("hi!", (java.lang.Object) nativeArray74, method91, method92, 8);
        nativeArray46.defineConst("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray74);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = nativeArray21.removeAll((java.util.Collection) nativeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(scriptable41);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[null]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[null]");
        org.junit.Assert.assertNull(scriptable81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(scriptable83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(scriptable88);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray7 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray4.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray7, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj15 = nativeArray7.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.Callable callable18 = null;
        nativeArray7.setGetterOrSetter("hi!", 0, callable18, false);
        nativeArray1.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray7, (int) (short) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int27 = nativeArray25.lastIndexOf((java.lang.Object) (short) 10);
        long long28 = nativeArray25.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray25, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable32 = null;
        java.lang.Object[] objArray33 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable32);
        java.lang.Object[] objArray34 = nativeArray25.toArray(objArray33);
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int39 = nativeArray37.lastIndexOf((java.lang.Object) (short) 10);
        long long40 = nativeArray37.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray37, "", true);
        boolean boolean44 = nativeArray37.hasPrototypeMap();
        int int45 = nativeArray37.size();
        boolean boolean46 = nativeArray37.isEmpty();
        boolean boolean48 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray37, "Array");
        java.lang.Object obj49 = nativeArray25.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray37);
        java.lang.Object obj50 = nativeArray1.get("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray25);
        com.google.javascript.rhino.head.Context context51 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray53 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray53.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray56, (java.lang.Object) (-1));
        boolean boolean60 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray56, "");
        java.lang.Object[] objArray61 = nativeArray56.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray62 = new com.google.javascript.rhino.head.NativeArray(objArray61);
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int66 = nativeArray64.lastIndexOf((java.lang.Object) (short) 10);
        long long67 = nativeArray64.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray64, "", true);
        boolean boolean71 = nativeArray64.hasPrototypeMap();
        int int72 = nativeArray64.size();
        boolean boolean73 = nativeArray64.isEmpty();
        boolean boolean75 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray64, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray78 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int80 = nativeArray78.lastIndexOf((java.lang.Object) (short) 10);
        long long81 = nativeArray78.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray78, "", true);
        boolean boolean85 = nativeArray78.hasPrototypeMap();
        java.util.ListIterator listIterator86 = nativeArray78.listIterator();
        boolean boolean87 = nativeArray64.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray78);
        int int89 = nativeArray64.indexOf((java.lang.Object) ' ');
        long long90 = nativeArray64.getLength();
        boolean boolean92 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray64, "");
        nativeArray25.defineOwnProperty(context51, (java.lang.Object) objArray61, (com.google.javascript.rhino.head.ScriptableObject) nativeArray64);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[null]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(listIterator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj20 = nativeArray12.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray17);
        boolean boolean21 = nativeArray12.hasPrototypeMap();
        java.lang.Object[] objArray22 = nativeArray12.getIds();
        int int23 = nativeArray12.size();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        boolean boolean37 = nativeArray28.hasPrototypeMap();
        java.lang.Object[] objArray38 = nativeArray28.getIds();
        int int39 = nativeArray28.size();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray50.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj53 = nativeArray45.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        boolean boolean54 = nativeArray45.hasPrototypeMap();
        java.lang.Object[] objArray55 = nativeArray45.getIds();
        int int56 = nativeArray45.size();
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray45.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.lang.Object obj62 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        boolean boolean63 = nativeArray12.containsAll((java.util.Collection) nativeArray45);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array", false);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = nativeArray1.getAttributes(8);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property 8 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable2 = nativeArray1.getParentScope();
        java.lang.Object[] objArray3 = nativeArray1.getIds();
        boolean boolean4 = nativeArray1.isEmpty();
        nativeArray1.activatePrototypeMap(13);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        java.lang.Object[] objArray15 = nativeArray9.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable16 = nativeArray9.getParentScope();
        com.google.javascript.rhino.head.Context context17 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray19 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray19.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray22, (java.lang.Object) (-1));
        java.lang.Object[] objArray25 = nativeArray19.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable26 = nativeArray19.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable27 = nativeArray19.getParentScope();
        java.util.ListIterator listIterator28 = nativeArray19.listIterator();
        nativeArray9.defineOwnProperties(context17, (com.google.javascript.rhino.head.ScriptableObject) nativeArray19);
        long long30 = nativeArray19.jsGet_length();
        boolean boolean31 = nativeArray19.isEmpty();
        nativeArray19.setAttributes("object", (int) (byte) 0);
        nativeArray1.setAttributes("object", (com.google.javascript.rhino.head.Scriptable) nativeArray19, 5);
        java.lang.Object obj38 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray19, (int) (byte) -1);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable41 = nativeArray40.getParentScope();
        java.lang.Object[] objArray42 = nativeArray40.getIds();
        boolean boolean43 = nativeArray40.avoidObjectDetection();
        java.lang.Object obj47 = nativeArray40.getGetterOrSetter("", 0, true);
        boolean boolean48 = nativeArray40.avoidObjectDetection();
        boolean boolean49 = nativeArray19.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray40);
        org.junit.Assert.assertNull(scriptable2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNull(scriptable16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[null]");
        org.junit.Assert.assertNull(scriptable26);
        org.junit.Assert.assertNull(scriptable27);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(scriptable41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        boolean boolean24 = nativeArray1.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int28 = nativeArray26.lastIndexOf((java.lang.Object) (short) 10);
        long long29 = nativeArray26.getLength();
        nativeArray26.delete((int) (byte) 1);
        java.lang.Integer[] intArray32 = nativeArray26.getIndexIds();
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((java.lang.Object[]) intArray32);
        boolean boolean34 = nativeArray1.containsAll((java.util.Collection) nativeArray33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray37.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray40, (java.lang.Object) (-1));
        java.lang.Object[] objArray43 = nativeArray37.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable44 = nativeArray37.getParentScope();
        com.google.javascript.rhino.head.Context context45 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray47.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray50, (java.lang.Object) (-1));
        java.lang.Object[] objArray53 = nativeArray47.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable54 = nativeArray47.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable55 = nativeArray47.getParentScope();
        java.util.ListIterator listIterator56 = nativeArray47.listIterator();
        nativeArray37.defineOwnProperties(context45, (com.google.javascript.rhino.head.ScriptableObject) nativeArray47);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "hi!", (java.lang.Object) nativeArray47, 13);
        java.lang.Integer[] intArray60 = nativeArray47.getIndexIds();
        long long61 = nativeArray47.jsGet_length();
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[hi!]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[null]");
        org.junit.Assert.assertNull(scriptable44);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertNull(scriptable54);
        org.junit.Assert.assertNull(scriptable55);
        org.junit.Assert.assertNotNull(listIterator56);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = nativeArray4.getIds();
        java.lang.Integer[] intArray40 = nativeArray4.getIndexIds();
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray43.activatePrototypeMap((int) (short) 100);
        boolean boolean47 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray43, "hi!");
        long long48 = nativeArray43.jsGet_length();
        boolean boolean49 = nativeArray4.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray43);
        nativeArray4.setAttributes("hi!", 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray54.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray57, (java.lang.Object) (-1));
        java.lang.Object[] objArray60 = nativeArray54.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable61 = nativeArray54.getParentScope();
        com.google.javascript.rhino.head.Context context62 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray64.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray67, (java.lang.Object) (-1));
        java.lang.Object[] objArray70 = nativeArray64.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable71 = nativeArray64.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable72 = nativeArray64.getParentScope();
        java.util.ListIterator listIterator73 = nativeArray64.listIterator();
        nativeArray54.defineOwnProperties(context62, (com.google.javascript.rhino.head.ScriptableObject) nativeArray64);
        boolean boolean75 = nativeArray4.containsAll((java.util.Collection) nativeArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list78 = nativeArray64.subList((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[null]");
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[null]");
        org.junit.Assert.assertNull(scriptable71);
        org.junit.Assert.assertNull(scriptable72);
        org.junit.Assert.assertNotNull(listIterator73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.activatePrototypeMap((int) (short) 100);
        long long4 = nativeArray1.jsGet_length();
        com.google.javascript.rhino.head.NativeArray nativeArray6 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray6.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray9, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj17 = nativeArray9.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray14);
        boolean boolean18 = nativeArray9.hasPrototypeMap();
        java.lang.Object[] objArray19 = nativeArray9.getIds();
        int int20 = nativeArray9.size();
        boolean boolean21 = nativeArray1.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray9);
        java.util.Iterator iterator22 = nativeArray9.iterator();
        com.google.javascript.rhino.head.Context context23 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int27 = nativeArray25.lastIndexOf((java.lang.Object) (short) 10);
        long long28 = nativeArray25.getLength();
        java.lang.Object[] objArray29 = nativeArray25.toArray();
        nativeArray25.setAttributes("Array", (int) (short) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray34.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray37, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj45 = nativeArray37.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray42);
        boolean boolean46 = nativeArray37.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int50 = nativeArray48.lastIndexOf((java.lang.Object) (short) 10);
        long long51 = nativeArray48.getLength();
        nativeArray48.delete((int) (byte) 1);
        boolean boolean54 = nativeArray48.isExtensible();
        java.lang.Object obj56 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray48, 4);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray48, "hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj60 = nativeArray25.associateValue((java.lang.Object) nativeArray37, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            nativeArray9.defineOwnProperties(context23, (com.google.javascript.rhino.head.ScriptableObject) nativeArray25);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError: Expected argument of type object, but instead had type object");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[hi!]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (short) 10 + "'", obj60, (short) 10);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray2 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int4 = nativeArray2.lastIndexOf((java.lang.Object) (short) 10);
        long long5 = nativeArray2.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray2, "", true);
        boolean boolean9 = nativeArray2.hasPrototypeMap();
        com.google.javascript.rhino.head.Scriptable scriptable10 = nativeArray2.getParentScope();
        boolean boolean11 = nativeArray2.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int16 = nativeArray14.lastIndexOf((java.lang.Object) (short) 10);
        long long17 = nativeArray14.getLength();
        nativeArray14.delete((int) (byte) 1);
        boolean boolean20 = nativeArray14.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray22.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray25, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray30.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj33 = nativeArray25.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        boolean boolean34 = nativeArray25.hasPrototypeMap();
        java.lang.Object[] objArray35 = nativeArray25.getIds();
        int int36 = nativeArray25.size();
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray38.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray41, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray46.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj49 = nativeArray41.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray46);
        boolean boolean50 = nativeArray41.hasPrototypeMap();
        java.lang.Object[] objArray51 = nativeArray41.getIds();
        int int52 = nativeArray41.size();
        com.google.javascript.rhino.head.NativeArray nativeArray55 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray55.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray58, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray63.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj66 = nativeArray58.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray63);
        boolean boolean67 = nativeArray58.hasPrototypeMap();
        java.lang.Object[] objArray68 = nativeArray58.getIds();
        int int69 = nativeArray58.size();
        com.google.javascript.rhino.head.NativeArray nativeArray71 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int73 = nativeArray71.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray58.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray71);
        java.lang.Object obj75 = nativeArray41.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray58);
        boolean boolean76 = nativeArray25.containsAll((java.util.Collection) nativeArray58);
        nativeArray14.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray25);
        com.google.javascript.rhino.head.Scriptable scriptable78 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray14);
        com.google.javascript.rhino.head.Scriptable scriptable79 = nativeArray14.getPrototype();
        java.lang.Object[] objArray80 = nativeArray14.getIds();
        java.lang.Object obj82 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray14, "Array");
        java.lang.Object[] objArray83 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj84 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, (com.google.javascript.rhino.head.Scriptable) nativeArray2, "", objArray83);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError:  is not a function, it is object.");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scriptable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[hi!]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[hi!]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(scriptable78);
        org.junit.Assert.assertNull(scriptable79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj20 = nativeArray12.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray17);
        boolean boolean21 = nativeArray12.hasPrototypeMap();
        java.lang.Object[] objArray22 = nativeArray12.getIds();
        int int23 = nativeArray12.size();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        boolean boolean37 = nativeArray28.hasPrototypeMap();
        java.lang.Object[] objArray38 = nativeArray28.getIds();
        int int39 = nativeArray28.size();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray50.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj53 = nativeArray45.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        boolean boolean54 = nativeArray45.hasPrototypeMap();
        java.lang.Object[] objArray55 = nativeArray45.getIds();
        int int56 = nativeArray45.size();
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray45.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.lang.Object obj62 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        boolean boolean63 = nativeArray12.containsAll((java.util.Collection) nativeArray45);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!");
        long long67 = nativeArray1.getLength();
        java.lang.Object[] objArray68 = nativeArray1.toArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[null]");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        java.lang.Integer[] intArray7 = nativeArray1.getIndexIds();
        java.lang.Object obj9 = null;
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", obj9);
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 8);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray17, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int24 = nativeArray22.lastIndexOf((java.lang.Object) (short) 10);
        long long25 = nativeArray22.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray30.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray33, (java.lang.Object) (-1));
        java.lang.Object[] objArray36 = nativeArray30.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable37 = nativeArray30.getParentScope();
        boolean boolean38 = nativeArray22.containsAll((java.util.Collection) nativeArray30);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray40.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray43, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj51 = nativeArray43.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray48);
        boolean boolean52 = nativeArray43.hasPrototypeMap();
        java.lang.Object[] objArray53 = nativeArray43.getIds();
        java.lang.Object[] objArray54 = nativeArray30.toArray(objArray53);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, "Array");
        java.lang.Object obj57 = nativeArray17.get(2, (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        java.lang.Object obj58 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray1, (java.lang.Object) nativeArray17);
        boolean boolean59 = nativeArray17.isEmpty();
        boolean boolean60 = nativeArray17.isSealed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[null]");
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[null]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        nativeArray1.setAttributes("hi!", (int) (byte) 0);
        java.lang.Object[] objArray20 = nativeArray1.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray31.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray34, (java.lang.Object) (-1));
        nativeArray23.put((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray31, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 0, (java.lang.Object) nativeArray31);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray42, "", (java.lang.Object) 100);
        boolean boolean46 = nativeArray42.avoidObjectDetection();
        boolean boolean48 = nativeArray42.isConst("hi!");
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) (-1));
        nativeArray42.setAttributes(0, (com.google.javascript.rhino.head.Scriptable) nativeArray54, (int) (byte) 10);
        boolean boolean59 = nativeArray31.has("object", (com.google.javascript.rhino.head.Scriptable) nativeArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = nativeArray42.getAttributes((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property -1 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, length]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray20, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj28 = nativeArray20.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray25);
        boolean boolean29 = nativeArray20.hasPrototypeMap();
        java.lang.Object[] objArray30 = nativeArray20.getIds();
        int int31 = nativeArray20.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray34.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray37, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj45 = nativeArray37.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray42);
        boolean boolean46 = nativeArray37.hasPrototypeMap();
        java.lang.Object[] objArray47 = nativeArray37.getIds();
        int int48 = nativeArray37.size();
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int52 = nativeArray50.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray37.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray50);
        java.lang.Object obj54 = nativeArray20.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray37);
        boolean boolean55 = nativeArray4.containsAll((java.util.Collection) nativeArray37);
        com.google.javascript.rhino.head.Scriptable scriptable56 = nativeArray4.getParentScope();
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable59 = nativeArray58.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        com.google.javascript.rhino.head.NativeArray nativeArray62 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int64 = nativeArray62.lastIndexOf((java.lang.Object) (short) 10);
        long long65 = nativeArray62.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray62, "", true);
        boolean boolean69 = nativeArray62.hasPrototypeMap();
        int int70 = nativeArray62.size();
        boolean boolean71 = nativeArray62.isEmpty();
        nativeArray58.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray62);
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray62);
        // The following exception was thrown during execution in test generation
        try {
            nativeArray62.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[hi!]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(scriptable56);
        org.junit.Assert.assertNull(scriptable59);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = nativeArray4.getIds();
        java.lang.Integer[] intArray40 = nativeArray4.getIndexIds();
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((java.lang.Object[]) intArray40);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray43.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray46, (java.lang.Object) (-1));
        java.lang.Object[] objArray49 = nativeArray43.toArray();
        com.google.javascript.rhino.head.Context context50 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int54 = nativeArray52.lastIndexOf((java.lang.Object) (short) 10);
        long long55 = nativeArray52.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray52, "", true);
        boolean boolean59 = nativeArray52.hasPrototypeMap();
        int int60 = nativeArray52.size();
        boolean boolean61 = nativeArray52.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray66 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray63.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray66, (java.lang.Object) (-1));
        java.lang.Object[] objArray69 = nativeArray63.getAllIds();
        nativeArray63.delete("");
        long long72 = nativeArray63.getLength();
        boolean boolean73 = nativeArray52.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray63);
        nativeArray63.sealObject();
        nativeArray43.defineOwnProperties(context50, (com.google.javascript.rhino.head.ScriptableObject) nativeArray63);
        java.util.ListIterator listIterator76 = nativeArray63.listIterator();
        boolean boolean77 = nativeArray41.containsAll((java.util.Collection) nativeArray63);
        java.lang.Object[] objArray78 = nativeArray41.getAllIds();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[null]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[length]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(listIterator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[length]");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj20 = nativeArray12.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray17);
        boolean boolean21 = nativeArray12.hasPrototypeMap();
        java.lang.Object[] objArray22 = nativeArray12.getIds();
        int int23 = nativeArray12.size();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        boolean boolean37 = nativeArray28.hasPrototypeMap();
        java.lang.Object[] objArray38 = nativeArray28.getIds();
        int int39 = nativeArray28.size();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray50.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj53 = nativeArray45.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        boolean boolean54 = nativeArray45.hasPrototypeMap();
        java.lang.Object[] objArray55 = nativeArray45.getIds();
        int int56 = nativeArray45.size();
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray45.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.lang.Object obj62 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        boolean boolean63 = nativeArray12.containsAll((java.util.Collection) nativeArray45);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.Scriptable scriptable65 = nativeArray1.getParentScope();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array", true);
        java.lang.Object obj70 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(scriptable65);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Callable callable22 = null;
        nativeArray11.setGetterOrSetter("hi!", 0, callable22, false);
        java.lang.Integer[] intArray25 = nativeArray11.getIndexIds();
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int31 = nativeArray29.lastIndexOf((java.lang.Object) (short) 10);
        long long32 = nativeArray29.getLength();
        nativeArray29.delete((int) (byte) 1);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray29, "");
        nativeArray11.setAttributes("", (com.google.javascript.rhino.head.Scriptable) nativeArray29, 13);
        com.google.javascript.rhino.head.Scriptable scriptable39 = nativeArray29.getParentScope();
        boolean boolean41 = nativeArray29.isConst("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = nativeArray29.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(scriptable39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        java.lang.Object[] objArray15 = nativeArray9.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable16 = nativeArray9.getParentScope();
        boolean boolean17 = nativeArray1.containsAll((java.util.Collection) nativeArray9);
        com.google.javascript.rhino.head.Scriptable scriptable18 = nativeArray9.getParentScope();
        boolean boolean19 = nativeArray9.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int24 = nativeArray22.lastIndexOf((java.lang.Object) (short) 10);
        long long25 = nativeArray22.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "", true);
        boolean boolean29 = nativeArray22.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable33 = nativeArray32.getParentScope();
        java.lang.Object[] objArray34 = nativeArray32.getIds();
        boolean boolean35 = nativeArray32.isEmpty();
        boolean boolean36 = nativeArray22.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray32);
        boolean boolean38 = nativeArray32.isConst("object");
        java.lang.Object obj40 = nativeArray32.get((java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.Scriptable scriptable41 = null;
        nativeArray32.setParentScope(scriptable41);
        nativeArray9.setAttributes((-1), (com.google.javascript.rhino.head.Scriptable) nativeArray32, 0);
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray47.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray50, (java.lang.Object) (-1));
        java.lang.Object[] objArray53 = nativeArray47.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable54 = nativeArray47.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable55 = nativeArray47.getParentScope();
        boolean boolean56 = nativeArray47.isSealed();
        boolean boolean57 = nativeArray47.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray59 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray62 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray59.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray62, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray66 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray69 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray66.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray69, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray74 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray74.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj77 = nativeArray69.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray74);
        com.google.javascript.rhino.head.Callable callable80 = null;
        nativeArray69.setGetterOrSetter("hi!", 0, callable80, false);
        java.lang.Integer[] intArray83 = nativeArray69.getIndexIds();
        nativeArray62.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray69);
        java.lang.Object obj85 = nativeArray47.get((java.lang.Object) nativeArray69);
        com.google.javascript.rhino.head.NativeArray nativeArray87 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int89 = nativeArray87.lastIndexOf((java.lang.Object) (short) 10);
        long long90 = nativeArray87.getLength();
        nativeArray87.delete((int) (byte) 1);
        boolean boolean93 = nativeArray87.isExtensible();
        java.lang.Object obj95 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray87, 4);
        nativeArray32.put(0, (com.google.javascript.rhino.head.Scriptable) nativeArray47, (java.lang.Object) nativeArray87);
        boolean boolean97 = nativeArray32.isSealed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNull(scriptable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertNull(scriptable54);
        org.junit.Assert.assertNull(scriptable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        boolean boolean15 = nativeArray4.isEmpty();
        boolean boolean16 = nativeArray4.isExtensible();
        java.lang.Integer[] intArray17 = nativeArray4.getIndexIds();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, "hi!", false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        nativeArray1.setAttributes("hi!", (int) (byte) 0);
        java.lang.Object[] objArray20 = nativeArray1.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray31.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray34, (java.lang.Object) (-1));
        nativeArray23.put((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray31, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 0, (java.lang.Object) nativeArray31);
        int int40 = nativeArray1.size();
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray43.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray46, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray43);
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int53 = nativeArray51.lastIndexOf((java.lang.Object) (short) 10);
        long long54 = nativeArray51.getLength();
        nativeArray51.delete((int) (byte) 1);
        boolean boolean57 = nativeArray51.isExtensible();
        java.lang.Object obj59 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray51, 4);
        java.lang.Object[] objArray60 = nativeArray51.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray66 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray63.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray66, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray71 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray71.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj74 = nativeArray66.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray71);
        boolean boolean75 = nativeArray66.hasPrototypeMap();
        java.lang.Object[] objArray76 = nativeArray66.getIds();
        int int77 = nativeArray66.size();
        com.google.javascript.rhino.head.NativeArray nativeArray79 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int81 = nativeArray79.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray66.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray79);
        com.google.javascript.rhino.head.NativeArray nativeArray84 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable85 = nativeArray84.getParentScope();
        java.lang.Object[] objArray86 = nativeArray84.getIds();
        boolean boolean87 = nativeArray84.isEmpty();
        nativeArray51.put((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray66, (java.lang.Object) boolean87);
        boolean boolean89 = nativeArray43.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray66);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", (java.lang.Object) nativeArray43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, length]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[null]");
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[hi!]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNull(scriptable85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.Scriptable scriptable37 = null;
        java.lang.Object[] objArray38 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable37);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray40.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray43, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj51 = nativeArray43.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray48);
        com.google.javascript.rhino.head.Callable callable54 = null;
        nativeArray43.setGetterOrSetter("hi!", 0, callable54, false);
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray43);
        nativeArray9.defineOwnProperty(context36, (java.lang.Object) scriptable37, (com.google.javascript.rhino.head.ScriptableObject) nativeArray43);
        long long59 = nativeArray9.getLength();
        boolean boolean61 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray64.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray67, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray72.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj75 = nativeArray67.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray72);
        boolean boolean76 = nativeArray67.hasPrototypeMap();
        java.lang.Object[] objArray77 = nativeArray67.getIds();
        int int78 = nativeArray67.size();
        com.google.javascript.rhino.head.NativeArray nativeArray80 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int82 = nativeArray80.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray67.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray80);
        java.lang.Object[] objArray84 = nativeArray80.getAllIds();
        com.google.javascript.rhino.head.Context context85 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray87 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray90 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray87.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray90, (java.lang.Object) (-1));
        java.lang.Object[] objArray93 = nativeArray87.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable94 = nativeArray87.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable95 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray87);
        nativeArray80.defineOwnProperties(context85, (com.google.javascript.rhino.head.ScriptableObject) nativeArray87);
        nativeArray9.defineConst("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray80);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[hi!]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[length]");
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[null]");
        org.junit.Assert.assertNull(scriptable94);
        org.junit.Assert.assertNull(scriptable95);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.Scriptable scriptable37 = null;
        java.lang.Object[] objArray38 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable37);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray40.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray43, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj51 = nativeArray43.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray48);
        com.google.javascript.rhino.head.Callable callable54 = null;
        nativeArray43.setGetterOrSetter("hi!", 0, callable54, false);
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray43);
        nativeArray9.defineOwnProperty(context36, (java.lang.Object) scriptable37, (com.google.javascript.rhino.head.ScriptableObject) nativeArray43);
        java.lang.Object[] objArray59 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator listIterator61 = nativeArray43.listIterator(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[hi!]");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.setAttributes((int) (byte) 100, 0);
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int12 = nativeArray10.lastIndexOf((java.lang.Object) (short) 10);
        long long13 = nativeArray10.getLength();
        nativeArray10.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (byte) -1, (java.lang.Object) nativeArray10);
        java.util.Iterator iterator17 = nativeArray1.iterator();
        java.lang.Object[] objArray18 = nativeArray1.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int23 = nativeArray21.lastIndexOf((java.lang.Object) (short) 10);
        long long24 = nativeArray21.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "", true);
        boolean boolean28 = nativeArray21.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable32 = nativeArray31.getParentScope();
        java.lang.Object[] objArray33 = nativeArray31.getIds();
        boolean boolean34 = nativeArray31.isEmpty();
        boolean boolean35 = nativeArray21.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray31);
        java.lang.Object[] objArray36 = nativeArray21.getIds();
        com.google.javascript.rhino.head.Scriptable scriptable37 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Integer[] intArray38 = nativeArray21.getIndexIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = com.google.javascript.rhino.head.ScriptableObject.callMethod((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", (java.lang.Object[]) intArray38);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError: object is not a function, it is object.");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[null]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(scriptable32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        java.lang.Integer[] intArray34 = nativeArray24.getIndexIds();
        long long35 = nativeArray24.getLength();
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray38.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray41, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray46.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj49 = nativeArray41.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray46);
        boolean boolean50 = nativeArray41.hasPrototypeMap();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray24, (-1), (java.lang.Object) nativeArray41);
        int int52 = nativeArray41.size();
        com.google.javascript.rhino.head.Scriptable scriptable53 = nativeArray41.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            int int55 = nativeArray41.getAttributes((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property 1 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(scriptable53);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        java.lang.Object obj16 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (byte) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray29.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj32 = nativeArray24.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray29);
        com.google.javascript.rhino.head.Callable callable35 = null;
        nativeArray24.setGetterOrSetter("hi!", 0, callable35, false);
        nativeArray18.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray24, (int) (short) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray41.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray44, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray49.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj52 = nativeArray44.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray49);
        com.google.javascript.rhino.head.NativeArray nativeArray55 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int57 = nativeArray55.lastIndexOf((java.lang.Object) (short) 10);
        long long58 = nativeArray55.getLength();
        nativeArray55.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray49, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray64.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray67, (java.lang.Object) (-1));
        java.lang.Object[] objArray70 = nativeArray64.getAllIds();
        nativeArray64.delete("");
        java.lang.Object obj73 = nativeArray49.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray64);
        java.lang.Integer[] intArray74 = nativeArray64.getIndexIds();
        java.lang.Object obj75 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray18, (java.lang.Object) intArray74);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray18);
        boolean boolean77 = nativeArray18.isExtensible();
        boolean boolean78 = nativeArray18.isExtensible();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[length]");
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        java.lang.Object obj3 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        boolean boolean5 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!");
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        boolean boolean20 = nativeArray11.hasPrototypeMap();
        java.lang.Object[] objArray21 = nativeArray11.getIds();
        int int22 = nativeArray11.size();
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
        java.lang.Object obj45 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray28);
        java.lang.Object[] objArray46 = nativeArray11.getIds();
        java.lang.String str47 = nativeArray11.getClassName();
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int51 = nativeArray49.lastIndexOf((java.lang.Object) (short) 10);
        long long52 = nativeArray49.getLength();
        nativeArray49.setAttributes((int) (byte) 100, 0);
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        long long61 = nativeArray58.getLength();
        nativeArray58.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray49, (int) (byte) -1, (java.lang.Object) nativeArray58);
        java.util.Iterator iterator65 = nativeArray49.iterator();
        java.lang.Object[] objArray66 = nativeArray49.toArray();
        boolean boolean67 = nativeArray11.containsAll((java.util.Collection) nativeArray49);
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array", (java.lang.Object) boolean67, (int) (short) 10);
        boolean boolean70 = nativeArray1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list73 = nativeArray1.subList((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[hi!]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Array" + "'", str47, "Array");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[null]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        nativeArray1.delete("");
        long long10 = nativeArray1.getLength();
        boolean boolean11 = nativeArray1.hasPrototypeMap();
        com.google.javascript.rhino.head.Scriptable scriptable12 = nativeArray1.getPrototype();
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray15.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray18, (java.lang.Object) (-1));
        java.lang.Object[] objArray21 = nativeArray15.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable22 = nativeArray15.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable23 = nativeArray15.getParentScope();
        boolean boolean24 = nativeArray15.isSealed();
        boolean boolean25 = nativeArray15.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray28.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray31, (java.lang.Object) (-1));
        java.lang.Object[] objArray34 = nativeArray28.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable35 = nativeArray28.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable36 = nativeArray28.getParentScope();
        boolean boolean37 = nativeArray28.isSealed();
        java.lang.Object obj39 = nativeArray28.get(0L);
        long long40 = nativeArray28.getLength();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int44 = nativeArray42.lastIndexOf((java.lang.Object) (short) 10);
        long long45 = nativeArray42.getLength();
        nativeArray42.delete((int) (byte) 1);
        boolean boolean48 = nativeArray42.isExtensible();
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray42);
        nativeArray15.putConst("", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) nativeArray42);
        java.lang.Object obj51 = nativeArray1.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray28);
        java.lang.Object[] objArray52 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray28);
        com.google.javascript.rhino.head.Callable callable55 = null;
        // The following exception was thrown during execution in test generation
        try {
            nativeArray28.setGetterOrSetter("", (int) (short) 100, callable55, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null]");
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(scriptable35);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(scriptable49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable8 = nativeArray1.getParentScope();
        com.google.javascript.rhino.head.Context context9 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray11.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray14, (java.lang.Object) (-1));
        java.lang.Object[] objArray17 = nativeArray11.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable18 = nativeArray11.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable19 = nativeArray11.getParentScope();
        java.util.ListIterator listIterator20 = nativeArray11.listIterator();
        nativeArray1.defineOwnProperties(context9, (com.google.javascript.rhino.head.ScriptableObject) nativeArray11);
        com.google.javascript.rhino.head.Scriptable scriptable22 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray28.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray31, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj39 = nativeArray31.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray36);
        com.google.javascript.rhino.head.Callable callable42 = null;
        nativeArray31.setGetterOrSetter("hi!", 0, callable42, false);
        nativeArray25.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray31, (int) (short) 10);
        java.lang.Object obj47 = null;
        int int48 = nativeArray25.lastIndexOf(obj47);
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) (-1));
        java.lang.Object[] objArray57 = nativeArray51.getAllIds();
        nativeArray51.delete("");
        long long60 = nativeArray51.getLength();
        boolean boolean62 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray51, (int) (short) 10);
        nativeArray51.delete(2);
        com.google.javascript.rhino.head.Scriptable scriptable65 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray51);
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        nativeArray25.defineProperty("object", (java.lang.Object) scriptable65, method66, method67, (int) (short) 0);
        com.google.javascript.rhino.head.NativeArray nativeArray71 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int73 = nativeArray71.lastIndexOf((java.lang.Object) (short) 10);
        long long74 = nativeArray71.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray71, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray79 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray82 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray79.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray82, (java.lang.Object) (-1));
        java.lang.Object[] objArray85 = nativeArray79.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable86 = nativeArray79.getParentScope();
        boolean boolean87 = nativeArray71.containsAll((java.util.Collection) nativeArray79);
        boolean boolean89 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray71, "object");
        com.google.javascript.rhino.head.Scriptable scriptable90 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray71);
        int int91 = nativeArray25.lastIndexOf((java.lang.Object) nativeArray71);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject93 = nativeArray11.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray25, false);
        boolean boolean94 = nativeArray11.isEmpty();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[null]");
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertNotNull(listIterator20);
        org.junit.Assert.assertNotNull(scriptable22);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[length]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(scriptable65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[null]");
        org.junit.Assert.assertNull(scriptable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(scriptable90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(idFunctionObject93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        com.google.javascript.rhino.head.Scriptable scriptable10 = null;
        java.lang.Object obj11 = nativeArray1.get((int) '#', scriptable10);
        nativeArray1.preventExtensions();
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        java.lang.Object[] objArray19 = nativeArray15.toArray();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        nativeArray1.defineProperty("Array", (java.lang.Object) nativeArray15, method20, method21, 13);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int28 = nativeArray26.lastIndexOf((java.lang.Object) (short) 10);
        long long29 = nativeArray26.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray26, "", true);
        boolean boolean33 = nativeArray26.hasPrototypeMap();
        int int34 = nativeArray26.size();
        boolean boolean35 = nativeArray26.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray37.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray40, (java.lang.Object) (-1));
        java.lang.Object[] objArray43 = nativeArray37.getAllIds();
        nativeArray37.delete("");
        long long46 = nativeArray37.getLength();
        boolean boolean47 = nativeArray26.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray37);
        nativeArray37.sealObject();
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray37, 0);
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int54 = nativeArray52.lastIndexOf((java.lang.Object) (short) 10);
        long long55 = nativeArray52.getLength();
        nativeArray52.delete((int) (byte) 1);
        boolean boolean58 = nativeArray52.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray61 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable62 = nativeArray61.getParentScope();
        java.lang.Object[] objArray63 = nativeArray61.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray52, "", (java.lang.Object) nativeArray61, 0);
        java.lang.Object[] objArray66 = nativeArray52.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable67 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray52);
        nativeArray52.sealObject();
        com.google.javascript.rhino.head.NativeArray nativeArray70 = new com.google.javascript.rhino.head.NativeArray((long) '#');
        java.lang.Object obj71 = nativeArray37.associateValue((java.lang.Object) nativeArray52, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int72 = nativeArray1.getAttributes((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray52);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property 10 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[length]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(scriptable62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[null]");
        org.junit.Assert.assertNull(scriptable67);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + '#' + "'", obj71, '#');
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        java.lang.Object[] objArray29 = nativeArray23.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable30 = nativeArray23.getParentScope();
        boolean boolean31 = nativeArray15.containsAll((java.util.Collection) nativeArray23);
        boolean boolean33 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "object");
        nativeArray1.put(100, (com.google.javascript.rhino.head.Scriptable) nativeArray15, (java.lang.Object) ' ');
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray37.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray40, (java.lang.Object) (-1));
        java.lang.Object[] objArray43 = nativeArray37.getAllIds();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray37, "Array", true);
        java.lang.Object obj48 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray37, "");
        java.lang.Object[] objArray49 = nativeArray37.getAllIds();
        java.lang.Object[] objArray50 = nativeArray15.toArray(objArray49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[length]");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[length]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,  ]");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        java.lang.Integer[] intArray34 = nativeArray24.getIndexIds();
        java.lang.Object obj36 = null;
        nativeArray24.defineProperty("", obj36, 10);
        com.google.javascript.rhino.head.Scriptable scriptable39 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray24);
        java.lang.Object[] objArray40 = nativeArray24.toArray();
        java.lang.Integer[] intArray41 = nativeArray24.getIndexIds();
        com.google.javascript.rhino.head.Scriptable scriptable42 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty(scriptable42, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNull(scriptable39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[null]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNull(scriptable42);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        int int17 = nativeArray1.size();
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        nativeArray1.activatePrototypeMap((int) ' ');
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int25 = nativeArray23.lastIndexOf((java.lang.Object) (short) 10);
        long long26 = nativeArray23.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray23, "", true);
        boolean boolean30 = nativeArray23.hasPrototypeMap();
        com.google.javascript.rhino.head.Scriptable scriptable31 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray23);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray34.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray37, (java.lang.Object) (-1));
        java.lang.Object[] objArray40 = nativeArray34.getAllIds();
        nativeArray34.delete("");
        long long43 = nativeArray34.getLength();
        boolean boolean45 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, (int) (short) 10);
        nativeArray34.delete(2);
        boolean boolean48 = nativeArray23.has(13, (com.google.javascript.rhino.head.Scriptable) nativeArray34);
        int int49 = nativeArray1.lastIndexOf((java.lang.Object) nativeArray34);
        nativeArray1.setAttributes((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(scriptable31);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[length]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        java.lang.Object[] objArray35 = nativeArray22.getIds();
        java.util.ListIterator listIterator36 = nativeArray22.listIterator();
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[hi!]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[hi!]");
        org.junit.Assert.assertNotNull(listIterator36);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable2 = nativeArray1.getParentScope();
        java.lang.Object[] objArray3 = nativeArray1.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray5.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray8, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray13.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj16 = nativeArray8.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray13);
        java.lang.Object obj17 = nativeArray1.getAssociatedValue((java.lang.Object) nativeArray8);
        long long18 = nativeArray8.jsGet_length();
        long long19 = nativeArray8.getLength();
        org.junit.Assert.assertNull(scriptable2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[length]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        nativeArray1.setAttributes("hi!", (int) (byte) 0);
        java.lang.Object[] objArray20 = nativeArray1.getAllIds();
        boolean boolean21 = nativeArray1.hasPrototypeMap();
        java.lang.Object obj22 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int26 = nativeArray24.lastIndexOf((java.lang.Object) (short) 10);
        long long27 = nativeArray24.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray24, "", true);
        boolean boolean31 = nativeArray24.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable35 = nativeArray34.getParentScope();
        java.lang.Object[] objArray36 = nativeArray34.getIds();
        boolean boolean37 = nativeArray34.isEmpty();
        boolean boolean38 = nativeArray24.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object[] objArray39 = nativeArray24.getIds();
        java.lang.Object[] objArray40 = nativeArray24.getAllIds();
        java.lang.Object obj41 = nativeArray1.associateValue(obj22, (java.lang.Object) objArray40);
        java.util.Iterator iterator42 = nativeArray1.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, length]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(scriptable35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[length]");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        boolean boolean18 = nativeArray11.avoidObjectDetection();
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable23 = nativeArray22.getParentScope();
        java.lang.Object[] objArray24 = nativeArray22.getIds();
        boolean boolean25 = nativeArray22.isEmpty();
        nativeArray22.delete((int) 'a');
        nativeArray11.defineProperty("", (java.lang.Object) nativeArray22, (int) (short) 1);
        boolean boolean30 = nativeArray22.hasPrototypeMap();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Callable callable22 = null;
        nativeArray11.setGetterOrSetter("hi!", 0, callable22, false);
        java.lang.Integer[] intArray25 = nativeArray11.getIndexIds();
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int30 = nativeArray28.lastIndexOf((java.lang.Object) (short) 10);
        long long31 = nativeArray28.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray28, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray39 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray39, (java.lang.Object) (-1));
        java.lang.Object[] objArray42 = nativeArray36.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeArray36.getParentScope();
        boolean boolean44 = nativeArray28.containsAll((java.util.Collection) nativeArray36);
        nativeArray36.delete("Array");
        java.lang.Object obj47 = nativeArray4.getAssociatedValue((java.lang.Object) nativeArray36);
        java.lang.Object[] objArray48 = nativeArray4.toArray();
        java.lang.Object[] objArray49 = nativeArray4.getIds();
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[null]");
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[null]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[hi!]");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list19 = nativeArray1.subList(8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        nativeArray4.sealObject();
        java.lang.Object obj18 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list21 = nativeArray4.subList((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray4);
        boolean boolean41 = nativeArray4.isConst("hi!");
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int46 = nativeArray44.lastIndexOf((java.lang.Object) (short) 10);
        long long47 = nativeArray44.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray44, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable51 = null;
        java.lang.Object[] objArray52 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable51);
        java.lang.Object[] objArray53 = nativeArray44.toArray(objArray52);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int58 = nativeArray56.lastIndexOf((java.lang.Object) (short) 10);
        long long59 = nativeArray56.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray56, "", true);
        boolean boolean63 = nativeArray56.hasPrototypeMap();
        int int64 = nativeArray56.size();
        boolean boolean65 = nativeArray56.isEmpty();
        boolean boolean67 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray56, "Array");
        java.lang.Object obj68 = nativeArray44.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray56);
        java.lang.Object obj69 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray56);
        boolean boolean71 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray56, "");
        com.google.javascript.rhino.head.NativeArray nativeArray73 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int75 = nativeArray73.lastIndexOf((java.lang.Object) (short) 10);
        long long76 = nativeArray73.getLength();
        nativeArray73.delete((int) (byte) 1);
        boolean boolean79 = nativeArray73.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray82 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable83 = nativeArray82.getParentScope();
        java.lang.Object[] objArray84 = nativeArray82.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray73, "", (java.lang.Object) nativeArray82, 0);
        nativeArray73.delete("Array");
        java.util.Iterator iterator89 = nativeArray73.iterator();
        java.lang.Object obj90 = nativeArray56.get((java.lang.Object) iterator89);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(scriptable83);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.Scriptable scriptable37 = null;
        java.lang.Object[] objArray38 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable37);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray40.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray43, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj51 = nativeArray43.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray48);
        com.google.javascript.rhino.head.Callable callable54 = null;
        nativeArray43.setGetterOrSetter("hi!", 0, callable54, false);
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray43);
        nativeArray9.defineOwnProperty(context36, (java.lang.Object) scriptable37, (com.google.javascript.rhino.head.ScriptableObject) nativeArray43);
        boolean boolean59 = nativeArray9.avoidObjectDetection();
        nativeArray9.delete((int) (byte) 100);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable2 = nativeArray1.getParentScope();
        java.lang.Object[] objArray3 = nativeArray1.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray5.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray8, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray13.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj16 = nativeArray8.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray13);
        java.lang.Object obj17 = nativeArray1.getAssociatedValue((java.lang.Object) nativeArray8);
        com.google.javascript.rhino.head.Scriptable scriptable18 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        boolean boolean19 = nativeArray1.avoidObjectDetection();
        com.google.javascript.rhino.head.Scriptable scriptable20 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        org.junit.Assert.assertNull(scriptable2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[length]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(scriptable20);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Callable callable22 = null;
        nativeArray11.setGetterOrSetter("hi!", 0, callable22, false);
        java.lang.Integer[] intArray25 = nativeArray11.getIndexIds();
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int31 = nativeArray29.lastIndexOf((java.lang.Object) (short) 10);
        long long32 = nativeArray29.getLength();
        nativeArray29.delete((int) (byte) 1);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray29, "");
        nativeArray11.setAttributes("", (com.google.javascript.rhino.head.Scriptable) nativeArray29, 13);
        com.google.javascript.rhino.head.Scriptable scriptable39 = nativeArray29.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable40 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray29);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int45 = nativeArray43.lastIndexOf((java.lang.Object) (short) 10);
        long long46 = nativeArray43.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray43, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable50 = null;
        java.lang.Object[] objArray51 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable50);
        java.lang.Object[] objArray52 = nativeArray43.toArray(objArray51);
        com.google.javascript.rhino.head.NativeArray nativeArray55 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int57 = nativeArray55.lastIndexOf((java.lang.Object) (short) 10);
        long long58 = nativeArray55.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray55, "", true);
        boolean boolean62 = nativeArray55.hasPrototypeMap();
        int int63 = nativeArray55.size();
        boolean boolean64 = nativeArray55.isEmpty();
        boolean boolean66 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray55, "Array");
        java.lang.Object obj67 = nativeArray43.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray55);
        com.google.javascript.rhino.head.NativeArray nativeArray70 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int72 = nativeArray70.lastIndexOf((java.lang.Object) (short) 10);
        long long73 = nativeArray70.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray70, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray78 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray81 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray78.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray81, (java.lang.Object) (-1));
        java.lang.Object[] objArray84 = nativeArray78.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable85 = nativeArray78.getParentScope();
        boolean boolean86 = nativeArray70.containsAll((java.util.Collection) nativeArray78);
        java.lang.Object obj87 = nativeArray55.get((int) (byte) -1, (com.google.javascript.rhino.head.Scriptable) nativeArray78);
        nativeArray29.defineProperty("object", (java.lang.Object) nativeArray55, (int) (short) 0);
        java.util.ListIterator listIterator90 = nativeArray55.listIterator();
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray55, "object");
        nativeArray55.sealObject();
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(scriptable39);
        org.junit.Assert.assertNotNull(scriptable40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[null]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[null]");
        org.junit.Assert.assertNull(scriptable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(listIterator90);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable8 = null;
        java.lang.Object[] objArray9 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable8);
        java.lang.Object[] objArray10 = nativeArray1.toArray(objArray9);
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        java.lang.Object[] objArray12 = nativeArray1.getIds();
        java.lang.String str13 = nativeArray1.getClassName();
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable22 = null;
        java.lang.Object[] objArray23 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable22);
        java.lang.Object[] objArray24 = nativeArray15.toArray(objArray23);
        java.lang.Object[] objArray25 = nativeArray1.toArray(objArray23);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray(objArray25);
        java.lang.Object[] objArray27 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray26);
        java.lang.Object[] objArray28 = nativeArray26.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Array" + "'", str13, "Array");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[null]");
        org.junit.Assert.assertNull(scriptable29);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray15, (java.lang.Object) (-1));
        java.lang.Object[] objArray18 = nativeArray12.getAllIds();
        nativeArray12.delete("");
        long long21 = nativeArray12.getLength();
        boolean boolean22 = nativeArray1.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.Scriptable scriptable23 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        java.lang.Object[] objArray26 = nativeArray1.toArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[length]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[null]");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        nativeArray1.setAttributes("hi!", (int) (byte) 0);
        nativeArray1.delete((int) (short) -1);
        com.google.javascript.rhino.head.Scriptable scriptable23 = null;
        boolean boolean24 = nativeArray1.has("object", scriptable23);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray27.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray30, (java.lang.Object) (-1));
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, "");
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray40, "", (java.lang.Object) 100);
        java.lang.Object obj44 = nativeArray37.associateValue((java.lang.Object) ' ', (java.lang.Object) nativeArray40);
        java.lang.Object[] objArray45 = nativeArray40.toArray();
        nativeArray30.setAttributes((int) (byte) 100, (com.google.javascript.rhino.head.Scriptable) nativeArray40, (int) (short) 0);
        boolean boolean48 = nativeArray1.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[null]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        java.lang.Object[] objArray15 = nativeArray9.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable16 = nativeArray9.getParentScope();
        boolean boolean17 = nativeArray1.containsAll((java.util.Collection) nativeArray9);
        com.google.javascript.rhino.head.Scriptable scriptable18 = nativeArray9.getParentScope();
        boolean boolean19 = nativeArray9.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable23 = nativeArray22.getParentScope();
        java.lang.Object[] objArray24 = nativeArray22.getIds();
        boolean boolean25 = nativeArray9.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray22);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) (byte) 0);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNull(scriptable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray21);
        boolean boolean40 = nativeArray21.isSealed();
        java.lang.Object obj42 = nativeArray21.get((int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeArray21.getPrototype();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(scriptable43);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray7 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray4.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray7, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj15 = nativeArray7.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.Callable callable18 = null;
        nativeArray7.setGetterOrSetter("hi!", 0, callable18, false);
        nativeArray1.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray7, (int) (short) 10);
        java.lang.Object obj23 = null;
        int int24 = nativeArray1.lastIndexOf(obj23);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray27.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray30, (java.lang.Object) (-1));
        java.lang.Object[] objArray33 = nativeArray27.getAllIds();
        nativeArray27.delete("");
        long long36 = nativeArray27.getLength();
        boolean boolean38 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray27, (int) (short) 10);
        nativeArray27.delete(2);
        com.google.javascript.rhino.head.Scriptable scriptable41 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray27);
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        nativeArray1.defineProperty("object", (java.lang.Object) scriptable41, method42, method43, (int) (short) 0);
        java.lang.Object[] objArray46 = nativeArray1.getAllIds();
        boolean boolean47 = nativeArray1.isEmpty();
        java.util.ListIterator listIterator49 = nativeArray1.listIterator(0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[length]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(scriptable41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[object, 1, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[object, 1, length]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(listIterator49);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Callable callable22 = null;
        nativeArray11.setGetterOrSetter("hi!", 0, callable22, false);
        java.lang.Integer[] intArray25 = nativeArray11.getIndexIds();
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        boolean boolean28 = nativeArray11.isConst("hi!");
        java.lang.Object[] objArray29 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.Scriptable scriptable30 = nativeArray11.getPrototype();
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!]");
        org.junit.Assert.assertNull(scriptable30);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Callable callable22 = null;
        nativeArray11.setGetterOrSetter("hi!", 0, callable22, false);
        java.lang.Integer[] intArray25 = nativeArray11.getIndexIds();
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int31 = nativeArray29.lastIndexOf((java.lang.Object) (short) 10);
        long long32 = nativeArray29.getLength();
        nativeArray29.delete((int) (byte) 1);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray29, "");
        nativeArray11.setAttributes("", (com.google.javascript.rhino.head.Scriptable) nativeArray29, 13);
        nativeArray11.delete((int) ' ');
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 'a');
        com.google.javascript.rhino.head.Context context44 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int48 = nativeArray46.lastIndexOf((java.lang.Object) (short) 10);
        long long49 = nativeArray46.getLength();
        nativeArray46.delete((int) (byte) 1);
        boolean boolean53 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray46, "");
        com.google.javascript.rhino.head.NativeArray nativeArray55 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int57 = nativeArray55.lastIndexOf((java.lang.Object) (short) 10);
        long long58 = nativeArray55.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray55, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray66 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray63.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray66, (java.lang.Object) (-1));
        java.lang.Object[] objArray69 = nativeArray63.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable70 = nativeArray63.getParentScope();
        boolean boolean71 = nativeArray55.containsAll((java.util.Collection) nativeArray63);
        boolean boolean72 = nativeArray46.containsAll((java.util.Collection) nativeArray55);
        nativeArray43.defineOwnProperties(context44, (com.google.javascript.rhino.head.ScriptableObject) nativeArray55);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray11, (int) (byte) -1, (java.lang.Object) context44);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[null]");
        org.junit.Assert.assertNull(scriptable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable8 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        boolean boolean9 = nativeArray1.isSealed();
        long long10 = nativeArray1.jsGet_length();
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray13.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray16, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj24 = nativeArray16.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        boolean boolean25 = nativeArray16.hasPrototypeMap();
        java.lang.Object[] objArray26 = nativeArray16.getIds();
        int int27 = nativeArray16.size();
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray30.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray33, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray38.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj41 = nativeArray33.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray38);
        boolean boolean42 = nativeArray33.hasPrototypeMap();
        java.lang.Object[] objArray43 = nativeArray33.getIds();
        int int44 = nativeArray33.size();
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int48 = nativeArray46.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray33.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray46);
        java.lang.Object obj50 = nativeArray16.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        java.lang.Object[] objArray51 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int56 = nativeArray54.lastIndexOf((java.lang.Object) (short) 10);
        long long57 = nativeArray54.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray54, "", true);
        boolean boolean61 = nativeArray54.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray66 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray63.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray66, (java.lang.Object) (-1));
        java.lang.Object[] objArray69 = nativeArray63.getAllIds();
        nativeArray63.delete("");
        boolean boolean72 = nativeArray54.contains((java.lang.Object) "");
        boolean boolean73 = nativeArray16.has("object", (com.google.javascript.rhino.head.Scriptable) nativeArray54);
        com.google.javascript.rhino.head.Context context74 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray76 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int78 = nativeArray76.lastIndexOf((java.lang.Object) (short) 10);
        long long79 = nativeArray76.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray76, "", true);
        boolean boolean83 = nativeArray76.hasPrototypeMap();
        boolean boolean84 = nativeArray76.isExtensible();
        nativeArray16.defineOwnProperties(context74, (com.google.javascript.rhino.head.ScriptableObject) nativeArray76);
        boolean boolean86 = nativeArray16.isSealed();
        java.lang.Object[] objArray87 = nativeArray16.toArray();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", (java.lang.Object) nativeArray16);
        boolean boolean90 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray16, 4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[hi!]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[hi!]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[length]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[null]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray4);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int44 = nativeArray42.lastIndexOf((java.lang.Object) (short) 10);
        long long45 = nativeArray42.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray42, "", true);
        boolean boolean49 = nativeArray42.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) (-1));
        java.lang.Object[] objArray57 = nativeArray51.getAllIds();
        nativeArray51.delete("");
        boolean boolean60 = nativeArray42.contains((java.lang.Object) "");
        boolean boolean61 = nativeArray4.has("object", (com.google.javascript.rhino.head.Scriptable) nativeArray42);
        boolean boolean63 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, 4);
        java.lang.Class<?> wildcardClass64 = nativeArray4.getClass();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[length]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        nativeArray1.delete("");
        long long10 = nativeArray1.getLength();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (short) 10);
        nativeArray1.delete(2);
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        boolean boolean16 = nativeArray1.isExtensible();
        nativeArray1.delete((int) (short) 0);
        java.lang.Object[] objArray19 = nativeArray1.toArray();
        java.lang.String str20 = nativeArray1.getClassName();
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray22.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray25, (java.lang.Object) (-1));
        java.lang.Object obj31 = nativeArray25.getGetterOrSetter("object", (int) (short) 0, true);
        nativeArray25.setAttributes(1, (int) (short) 1);
        com.google.javascript.rhino.head.Scriptable scriptable35 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray25);
        java.lang.Object[] objArray36 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable35);
        java.lang.Object[] objArray37 = nativeArray1.toArray(objArray36);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scriptable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Array" + "'", str20, "Array");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(scriptable35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[null, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[null, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[null, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[null, 1]");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        java.lang.String str8 = nativeArray1.getTypeOf();
        int int9 = nativeArray1.size();
        java.lang.Object[] objArray10 = nativeArray1.toArray();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "object" + "'", str8, "object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = nativeArray4.getIds();
        java.lang.Integer[] intArray40 = nativeArray4.getIndexIds();
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray43.activatePrototypeMap((int) (short) 100);
        boolean boolean47 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray43, "hi!");
        long long48 = nativeArray43.jsGet_length();
        boolean boolean49 = nativeArray4.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray43);
        nativeArray43.setAttributes("", (int) (short) 0);
        long long53 = nativeArray43.jsGet_length();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Context context15 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int19 = nativeArray17.lastIndexOf((java.lang.Object) (short) 10);
        long long20 = nativeArray17.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray17, "", true);
        boolean boolean24 = nativeArray17.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable28 = nativeArray27.getParentScope();
        java.lang.Object[] objArray29 = nativeArray27.getIds();
        boolean boolean30 = nativeArray27.isEmpty();
        boolean boolean31 = nativeArray17.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray27);
        boolean boolean33 = nativeArray27.isConst("object");
        nativeArray1.defineOwnProperties(context15, (com.google.javascript.rhino.head.ScriptableObject) nativeArray27);
        java.lang.Object[] objArray35 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 'a');
        com.google.javascript.rhino.head.Context context39 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int43 = nativeArray41.lastIndexOf((java.lang.Object) (short) 10);
        long long44 = nativeArray41.getLength();
        nativeArray41.delete((int) (byte) 1);
        boolean boolean48 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray41, "");
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int52 = nativeArray50.lastIndexOf((java.lang.Object) (short) 10);
        long long53 = nativeArray50.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray50, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray61 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray58.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray61, (java.lang.Object) (-1));
        java.lang.Object[] objArray64 = nativeArray58.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable65 = nativeArray58.getParentScope();
        boolean boolean66 = nativeArray50.containsAll((java.util.Collection) nativeArray58);
        boolean boolean67 = nativeArray41.containsAll((java.util.Collection) nativeArray50);
        nativeArray38.defineOwnProperties(context39, (com.google.javascript.rhino.head.ScriptableObject) nativeArray50);
        java.lang.Object obj70 = nativeArray38.get((long) (short) 0);
        java.lang.Object obj72 = nativeArray38.get(0L);
        nativeArray1.setAttributes(8, (com.google.javascript.rhino.head.Scriptable) nativeArray38, 1);
        boolean boolean75 = nativeArray1.isExtensible();
        nativeArray1.delete(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scriptable11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(scriptable28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[null]");
        org.junit.Assert.assertNull(scriptable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) (short) 10);
        java.lang.Object obj3 = nativeArray1.get(0);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray2 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray2.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray5, (java.lang.Object) (-1));
        boolean boolean9 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray5, "");
        java.lang.Object[] objArray10 = nativeArray5.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int15 = nativeArray13.lastIndexOf((java.lang.Object) (short) 10);
        long long16 = nativeArray13.getLength();
        nativeArray13.delete((int) (byte) 1);
        nativeArray13.sealObject();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int23 = nativeArray21.lastIndexOf((java.lang.Object) (short) 10);
        long long24 = nativeArray21.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "", true);
        boolean boolean28 = nativeArray21.hasPrototypeMap();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        nativeArray21.defineProperty("hi!", (java.lang.Object) (-1L), method31, method32, (int) (byte) 10);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "");
        int int37 = nativeArray21.size();
        com.google.javascript.rhino.head.Scriptable scriptable39 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray21, "");
        java.lang.Object[] objArray40 = nativeArray21.getAllIds();
        boolean boolean41 = nativeArray13.contains((java.lang.Object) objArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, (com.google.javascript.rhino.head.Scriptable) nativeArray5, "hi!", objArray40);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError: hi! is not a function, it is object.");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(scriptable39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, length]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        java.lang.Object[] objArray15 = nativeArray9.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable16 = nativeArray9.getParentScope();
        boolean boolean17 = nativeArray1.containsAll((java.util.Collection) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int22 = nativeArray20.lastIndexOf((java.lang.Object) (short) 10);
        long long23 = nativeArray20.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray20, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable27 = null;
        java.lang.Object[] objArray28 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable27);
        java.lang.Object[] objArray29 = nativeArray20.toArray(objArray28);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", (java.lang.Object) objArray28);
        int int31 = nativeArray1.size();
        nativeArray1.activatePrototypeMap((int) (byte) 10);
        java.lang.Object obj35 = null;
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array", obj35, 8);
        java.lang.Integer[] intArray38 = nativeArray1.getIndexIds();
        int int40 = nativeArray1.getAttributes("Array");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNull(scriptable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        nativeArray1.delete("");
        long long10 = nativeArray1.getLength();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (short) 10);
        nativeArray1.delete(2);
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        boolean boolean16 = nativeArray1.isExtensible();
        nativeArray1.delete((int) (short) 0);
        java.lang.Object[] objArray19 = nativeArray1.toArray();
        nativeArray1.delete("");
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        java.lang.Object[] objArray29 = nativeArray23.getAllIds();
        nativeArray23.delete("");
        long long32 = nativeArray23.getLength();
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray23, (int) (short) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray37.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray40, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray45.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj48 = nativeArray40.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int53 = nativeArray51.lastIndexOf((java.lang.Object) (short) 10);
        long long54 = nativeArray51.getLength();
        nativeArray51.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray45, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray60.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray63, (java.lang.Object) (-1));
        java.lang.Object[] objArray66 = nativeArray60.getAllIds();
        nativeArray60.delete("");
        java.lang.Object obj69 = nativeArray45.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray60);
        java.lang.Integer[] intArray70 = nativeArray60.getIndexIds();
        nativeArray23.defineProperty("", (java.lang.Object) nativeArray60, 10);
        java.lang.Object[] objArray73 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray23);
        com.google.javascript.rhino.head.NativeArray nativeArray74 = new com.google.javascript.rhino.head.NativeArray(objArray73);
        java.lang.Object[] objArray75 = nativeArray1.toArray(objArray73);
        com.google.javascript.rhino.head.NativeArray nativeArray76 = new com.google.javascript.rhino.head.NativeArray(objArray75);
        com.google.javascript.rhino.head.NativeArray nativeArray77 = new com.google.javascript.rhino.head.NativeArray(objArray75);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scriptable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[length]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[length]");
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[null]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable8 = null;
        java.lang.Object[] objArray9 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable8);
        java.lang.Object[] objArray10 = nativeArray1.toArray(objArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int15 = nativeArray13.lastIndexOf((java.lang.Object) (short) 10);
        long long16 = nativeArray13.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "", true);
        boolean boolean20 = nativeArray13.hasPrototypeMap();
        int int21 = nativeArray13.size();
        boolean boolean22 = nativeArray13.isEmpty();
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "Array");
        java.lang.Object obj25 = nativeArray1.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray13);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, "", (java.lang.Object) 100);
        java.lang.Object obj34 = nativeArray27.associateValue((java.lang.Object) ' ', (java.lang.Object) nativeArray30);
        int int35 = nativeArray13.indexOf(obj34);
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray38.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray41, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray46.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj49 = nativeArray41.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray46);
        com.google.javascript.rhino.head.Callable callable52 = null;
        nativeArray41.setGetterOrSetter("hi!", 0, callable52, false);
        com.google.javascript.rhino.head.Scriptable scriptable55 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray41);
        nativeArray13.defineProperty("hi!", (java.lang.Object) scriptable55, 8);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "");
        java.lang.Object obj61 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "Array");
        com.google.javascript.rhino.head.Scriptable scriptable62 = nativeArray13.getParentScope();
        java.lang.Object obj64 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "object");
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int69 = nativeArray67.lastIndexOf((java.lang.Object) (short) 10);
        long long70 = nativeArray67.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray67, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray75 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray78 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray75.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray78, (java.lang.Object) (-1));
        java.lang.Object[] objArray81 = nativeArray75.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable82 = nativeArray75.getParentScope();
        boolean boolean83 = nativeArray67.containsAll((java.util.Collection) nativeArray75);
        com.google.javascript.rhino.head.Scriptable scriptable84 = nativeArray75.getParentScope();
        boolean boolean85 = nativeArray75.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray88 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable89 = nativeArray88.getParentScope();
        java.lang.Object[] objArray90 = nativeArray88.getIds();
        boolean boolean91 = nativeArray75.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray88);
        java.util.Iterator iterator92 = nativeArray88.iterator();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "hi!", (java.lang.Object) nativeArray88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(scriptable55);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNull(scriptable62);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[null]");
        org.junit.Assert.assertNull(scriptable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(scriptable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(scriptable89);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(iterator92);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        java.lang.Object obj3 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray6 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int8 = nativeArray6.lastIndexOf((java.lang.Object) (short) 10);
        long long9 = nativeArray6.getLength();
        nativeArray6.delete((int) (byte) 1);
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray6, "");
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        java.lang.Object[] objArray29 = nativeArray23.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable30 = nativeArray23.getParentScope();
        boolean boolean31 = nativeArray15.containsAll((java.util.Collection) nativeArray23);
        boolean boolean32 = nativeArray6.containsAll((java.util.Collection) nativeArray15);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        long long37 = nativeArray34.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        java.lang.Object[] objArray48 = nativeArray42.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable49 = nativeArray42.getParentScope();
        boolean boolean50 = nativeArray34.containsAll((java.util.Collection) nativeArray42);
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int54 = nativeArray52.lastIndexOf((java.lang.Object) (short) 10);
        long long55 = nativeArray52.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray52, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray60.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray63, (java.lang.Object) (-1));
        java.lang.Object[] objArray66 = nativeArray60.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable67 = nativeArray60.getParentScope();
        boolean boolean68 = nativeArray52.containsAll((java.util.Collection) nativeArray60);
        com.google.javascript.rhino.head.NativeArray nativeArray70 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray73 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray70.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray73, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray78 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray78.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj81 = nativeArray73.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray78);
        boolean boolean82 = nativeArray73.hasPrototypeMap();
        java.lang.Object[] objArray83 = nativeArray73.getIds();
        java.lang.Object[] objArray84 = nativeArray60.toArray(objArray83);
        java.lang.Object obj85 = nativeArray6.associateValue((java.lang.Object) boolean50, (java.lang.Object) nativeArray60);
        com.google.javascript.rhino.head.Scriptable scriptable86 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray60);
        boolean boolean87 = nativeArray1.has("hi!", scriptable86);
        boolean boolean88 = nativeArray1.avoidObjectDetection();
        java.lang.Object[] objArray89 = nativeArray1.getAllIds();
        com.google.javascript.rhino.head.Scriptable scriptable90 = null;
        nativeArray1.setParentScope(scriptable90);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[null]");
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[null]");
        org.junit.Assert.assertNull(scriptable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[null]");
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[null]");
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(scriptable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[length]");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable7 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray9);
        nativeArray1.setPrototype(scriptable15);
        int int17 = nativeArray1.size();
        java.lang.Object obj19 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable20 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        boolean boolean21 = nativeArray1.avoidObjectDetection();
        java.lang.Object[] objArray22 = nativeArray1.toArray();
        org.junit.Assert.assertNull(scriptable7);
        org.junit.Assert.assertNull(scriptable15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(scriptable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null]");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean8 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        java.lang.String str9 = nativeArray1.getClassName();
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray15, (java.lang.Object) (-1));
        java.lang.Object[] objArray18 = nativeArray12.getAllIds();
        nativeArray12.delete("");
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray12, "object");
        boolean boolean23 = nativeArray12.isSealed();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nativeArray1.getAttributes((int) (byte) -1, (com.google.javascript.rhino.head.Scriptable) nativeArray12);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property -1 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Array" + "'", str9, "Array");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[length]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.Callable callable15 = null;
        nativeArray4.setGetterOrSetter("hi!", 0, callable15, false);
        java.lang.Integer[] intArray18 = nativeArray4.getIndexIds();
        java.lang.Object[] objArray19 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray4);
        com.google.javascript.rhino.head.Scriptable scriptable20 = nativeArray4.getPrototype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.google.javascript.rhino.head.ScriptableObject.hasProperty(scriptable20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[hi!]");
        org.junit.Assert.assertNull(scriptable20);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Callable callable22 = null;
        nativeArray11.setGetterOrSetter("hi!", 0, callable22, false);
        java.lang.Integer[] intArray25 = nativeArray11.getIndexIds();
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int31 = nativeArray29.lastIndexOf((java.lang.Object) (short) 10);
        long long32 = nativeArray29.getLength();
        nativeArray29.delete((int) (byte) 1);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray29, "");
        nativeArray11.setAttributes("", (com.google.javascript.rhino.head.Scriptable) nativeArray29, 13);
        com.google.javascript.rhino.head.Scriptable scriptable39 = nativeArray29.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable40 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray29);
        java.lang.Object[] objArray41 = nativeArray29.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray(objArray41);
        nativeArray42.sealObject();
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(scriptable39);
        org.junit.Assert.assertNotNull(scriptable40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[null]");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray20, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj28 = nativeArray20.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray25);
        boolean boolean29 = nativeArray20.hasPrototypeMap();
        java.lang.Object[] objArray30 = nativeArray20.getIds();
        int int31 = nativeArray20.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray34.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray37, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj45 = nativeArray37.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray42);
        boolean boolean46 = nativeArray37.hasPrototypeMap();
        java.lang.Object[] objArray47 = nativeArray37.getIds();
        int int48 = nativeArray37.size();
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int52 = nativeArray50.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray37.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray50);
        java.lang.Object obj54 = nativeArray20.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray37);
        boolean boolean55 = nativeArray4.containsAll((java.util.Collection) nativeArray37);
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        long long61 = nativeArray58.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray58, "", true);
        boolean boolean65 = nativeArray58.hasPrototypeMap();
        int int66 = nativeArray58.size();
        boolean boolean67 = nativeArray58.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable68 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray58, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable72 = nativeArray58.getParentScope();
        java.lang.Object obj73 = nativeArray4.get("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.util.Iterator iterator74 = nativeArray4.iterator();
        nativeArray4.setAttributes("hi!", 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[hi!]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(scriptable68);
        org.junit.Assert.assertNull(scriptable72);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (-1) + "'", obj73, (-1));
        org.junit.Assert.assertNotNull(iterator74);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        com.google.javascript.rhino.head.Scriptable scriptable18 = nativeArray17.getParentScope();
        java.lang.Object[] objArray19 = nativeArray17.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray29.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj32 = nativeArray24.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray29);
        java.lang.Object obj33 = nativeArray17.getAssociatedValue((java.lang.Object) nativeArray24);
        nativeArray24.preventExtensions();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray24, "Array", false);
        boolean boolean38 = nativeArray1.containsAll((java.util.Collection) nativeArray24);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray43.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray46, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj54 = nativeArray46.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray51);
        com.google.javascript.rhino.head.Callable callable57 = null;
        nativeArray46.setGetterOrSetter("hi!", 0, callable57, false);
        nativeArray40.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray46, (int) (short) 10);
        java.lang.Object obj62 = null;
        int int63 = nativeArray40.lastIndexOf(obj62);
        com.google.javascript.rhino.head.NativeArray nativeArray66 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray69 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray66.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray69, (java.lang.Object) (-1));
        java.lang.Object[] objArray72 = nativeArray66.getAllIds();
        nativeArray66.delete("");
        long long75 = nativeArray66.getLength();
        boolean boolean77 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray66, (int) (short) 10);
        nativeArray66.delete(2);
        com.google.javascript.rhino.head.Scriptable scriptable80 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray66);
        java.lang.reflect.Method method81 = null;
        java.lang.reflect.Method method82 = null;
        nativeArray40.defineProperty("object", (java.lang.Object) scriptable80, method81, method82, (int) (short) 0);
        com.google.javascript.rhino.head.Scriptable scriptable86 = null;
        boolean boolean87 = nativeArray40.has((int) (short) 0, scriptable86);
        java.lang.Object obj88 = nativeArray24.get((java.lang.Object) (short) 0);
        nativeArray24.setAttributes("object", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[length]");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[length]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(scriptable80);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        java.lang.Integer[] intArray7 = nativeArray1.getIndexIds();
        java.lang.Object obj9 = null;
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", obj9);
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray1, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray15.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray18, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj26 = nativeArray18.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray23);
        boolean boolean27 = nativeArray18.hasPrototypeMap();
        java.lang.Object[] objArray28 = nativeArray18.getIds();
        int int29 = nativeArray18.size();
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray31.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray34, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray39 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray39.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj42 = nativeArray34.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray39);
        boolean boolean43 = nativeArray34.hasPrototypeMap();
        java.lang.Object[] objArray44 = nativeArray34.getIds();
        int int45 = nativeArray34.size();
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray51, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray56.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj59 = nativeArray51.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray56);
        boolean boolean60 = nativeArray51.hasPrototypeMap();
        java.lang.Object[] objArray61 = nativeArray51.getIds();
        int int62 = nativeArray51.size();
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int66 = nativeArray64.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray51.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray64);
        java.lang.Object obj68 = nativeArray34.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray51);
        boolean boolean69 = nativeArray18.containsAll((java.util.Collection) nativeArray51);
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable73 = nativeArray72.getParentScope();
        java.lang.Object[] objArray74 = nativeArray72.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray76 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray79 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray76.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray79, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray84 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray84.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj87 = nativeArray79.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray84);
        java.lang.Object obj88 = nativeArray72.getAssociatedValue((java.lang.Object) nativeArray79);
        com.google.javascript.rhino.head.Scriptable scriptable89 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray72);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray51, "hi!", (java.lang.Object) scriptable89);
        boolean boolean91 = nativeArray51.avoidObjectDetection();
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", (java.lang.Object) boolean91);
        nativeArray1.setAttributes((int) '#', (int) (byte) 1);
        nativeArray1.setAttributes((int) (short) 100, 13);
        nativeArray1.sealObject();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[hi!]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[hi!]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(scriptable73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[length]");
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(scriptable89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable8 = nativeArray1.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable9 = nativeArray1.getParentScope();
        boolean boolean10 = nativeArray1.isSealed();
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray16, "", (java.lang.Object) 100);
        java.lang.Object obj20 = nativeArray13.associateValue((java.lang.Object) ' ', (java.lang.Object) nativeArray16);
        java.lang.Object[] objArray21 = nativeArray16.toArray();
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray16, "");
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray29, (java.lang.Object) (-1));
        boolean boolean33 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray29, "");
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int38 = nativeArray36.lastIndexOf((java.lang.Object) (short) 10);
        long long39 = nativeArray36.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray36, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray44.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray47, (java.lang.Object) (-1));
        java.lang.Object[] objArray50 = nativeArray44.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable51 = nativeArray44.getParentScope();
        boolean boolean52 = nativeArray36.containsAll((java.util.Collection) nativeArray44);
        com.google.javascript.rhino.head.Scriptable scriptable53 = nativeArray44.getParentScope();
        boolean boolean54 = nativeArray44.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable58 = nativeArray57.getParentScope();
        java.lang.Object[] objArray59 = nativeArray57.getIds();
        boolean boolean60 = nativeArray44.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray57);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        nativeArray29.defineProperty("hi!", (java.lang.Object) nativeArray44, method61, method62, 8);
        nativeArray16.defineConst("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray44);
        java.lang.Object[] objArray66 = nativeArray16.getIds();
        nativeArray1.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Scriptable scriptable68 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        nativeArray1.delete((int) (short) 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[null]");
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(scriptable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(scriptable58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNull(scriptable68);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 4);
        java.lang.Object[] objArray10 = nativeArray1.toArray();
        java.lang.Object obj12 = nativeArray1.get(0);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable15 = nativeArray14.getParentScope();
        java.lang.Object[] objArray16 = nativeArray14.getIds();
        boolean boolean17 = nativeArray14.isEmpty();
        java.lang.Object obj19 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray14, 8);
        com.google.javascript.rhino.head.Context context20 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int24 = nativeArray22.lastIndexOf((java.lang.Object) (short) 10);
        long long25 = nativeArray22.getLength();
        nativeArray22.delete((int) (byte) 1);
        java.lang.Integer[] intArray28 = nativeArray22.getIndexIds();
        nativeArray14.defineOwnProperties(context20, (com.google.javascript.rhino.head.ScriptableObject) nativeArray22);
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int34 = nativeArray32.lastIndexOf((java.lang.Object) (short) 10);
        long long35 = nativeArray32.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray32, "", true);
        boolean boolean39 = nativeArray32.hasPrototypeMap();
        int int40 = nativeArray32.size();
        boolean boolean41 = nativeArray32.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray43.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray46, (java.lang.Object) (-1));
        java.lang.Object[] objArray49 = nativeArray43.getAllIds();
        nativeArray43.delete("");
        long long52 = nativeArray43.getLength();
        boolean boolean53 = nativeArray32.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray43);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int58 = nativeArray56.lastIndexOf((java.lang.Object) (short) 10);
        long long59 = nativeArray56.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray56, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray64.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray67, (java.lang.Object) (-1));
        java.lang.Object[] objArray70 = nativeArray64.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable71 = nativeArray64.getParentScope();
        boolean boolean72 = nativeArray56.containsAll((java.util.Collection) nativeArray64);
        com.google.javascript.rhino.head.Scriptable scriptable73 = nativeArray64.getParentScope();
        boolean boolean74 = nativeArray64.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray77 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable78 = nativeArray77.getParentScope();
        java.lang.Object[] objArray79 = nativeArray77.getIds();
        boolean boolean80 = nativeArray64.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray77);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray43, "object", (java.lang.Object) nativeArray64);
        boolean boolean83 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray43, "");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject85 = nativeArray14.exportAsJSClass(10, (com.google.javascript.rhino.head.Scriptable) nativeArray43, false);
        boolean boolean86 = nativeArray1.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray14);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray14, "Array");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(scriptable15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[length]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[null]");
        org.junit.Assert.assertNull(scriptable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(scriptable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(scriptable78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(idFunctionObject85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        java.lang.String str8 = nativeArray1.getTypeOf();
        int int9 = nativeArray1.size();
        boolean boolean11 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!");
        java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 100);
        java.lang.Object obj14 = null;
        int int15 = nativeArray1.lastIndexOf(obj14);
        boolean boolean16 = nativeArray1.isEmpty();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "object" + "'", str8, "object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj20 = nativeArray12.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray17);
        boolean boolean21 = nativeArray12.hasPrototypeMap();
        java.lang.Object[] objArray22 = nativeArray12.getIds();
        int int23 = nativeArray12.size();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        boolean boolean37 = nativeArray28.hasPrototypeMap();
        java.lang.Object[] objArray38 = nativeArray28.getIds();
        int int39 = nativeArray28.size();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray50.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj53 = nativeArray45.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        boolean boolean54 = nativeArray45.hasPrototypeMap();
        java.lang.Object[] objArray55 = nativeArray45.getIds();
        int int56 = nativeArray45.size();
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray45.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.lang.Object obj62 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        boolean boolean63 = nativeArray12.containsAll((java.util.Collection) nativeArray45);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        java.util.ListIterator listIterator65 = nativeArray1.listIterator();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", true);
        java.util.Iterator iterator69 = nativeArray1.iterator();
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int74 = nativeArray72.lastIndexOf((java.lang.Object) (short) 10);
        long long75 = nativeArray72.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray72, "", true);
        boolean boolean79 = nativeArray72.hasPrototypeMap();
        int int80 = nativeArray72.size();
        boolean boolean81 = nativeArray72.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable82 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray72);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (short) 10, (java.lang.Object) scriptable82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(listIterator65);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(scriptable82);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray6 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int8 = nativeArray6.lastIndexOf((java.lang.Object) (short) 10);
        long long9 = nativeArray6.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray6, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray17, (java.lang.Object) (-1));
        java.lang.Object[] objArray20 = nativeArray14.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable21 = nativeArray14.getParentScope();
        boolean boolean22 = nativeArray6.containsAll((java.util.Collection) nativeArray14);
        com.google.javascript.rhino.head.Scriptable scriptable23 = nativeArray14.getParentScope();
        boolean boolean24 = nativeArray4.containsAll((java.util.Collection) nativeArray14);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray29, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray34.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj37 = nativeArray29.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray34);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int42 = nativeArray40.lastIndexOf((java.lang.Object) (short) 10);
        long long43 = nativeArray40.getLength();
        nativeArray40.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray49.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray52, (java.lang.Object) (-1));
        java.lang.Object[] objArray55 = nativeArray49.getAllIds();
        nativeArray49.delete("");
        java.lang.Object obj58 = nativeArray34.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray49);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable61 = nativeArray34.getPrototype();
        com.google.javascript.rhino.head.Context context62 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int66 = nativeArray64.lastIndexOf((java.lang.Object) (short) 10);
        long long67 = nativeArray64.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray64, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray75 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray72.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray75, (java.lang.Object) (-1));
        java.lang.Object[] objArray78 = nativeArray72.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable79 = nativeArray72.getParentScope();
        boolean boolean80 = nativeArray64.containsAll((java.util.Collection) nativeArray72);
        nativeArray34.defineOwnProperties(context62, (com.google.javascript.rhino.head.ScriptableObject) nativeArray64);
        java.lang.Object obj83 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "");
        nativeArray1.put("", (com.google.javascript.rhino.head.Scriptable) nativeArray14, (java.lang.Object) nativeArray34);
        boolean boolean86 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        com.google.javascript.rhino.head.Scriptable scriptable87 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[null]");
        org.junit.Assert.assertNull(scriptable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[length]");
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[null]");
        org.junit.Assert.assertNull(scriptable79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(scriptable87);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable8 = null;
        java.lang.Object[] objArray9 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable8);
        java.lang.Object[] objArray10 = nativeArray1.toArray(objArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int15 = nativeArray13.lastIndexOf((java.lang.Object) (short) 10);
        long long16 = nativeArray13.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "", true);
        boolean boolean20 = nativeArray13.hasPrototypeMap();
        int int21 = nativeArray13.size();
        boolean boolean22 = nativeArray13.isEmpty();
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "Array");
        java.lang.Object obj25 = nativeArray1.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray13);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int30 = nativeArray28.lastIndexOf((java.lang.Object) (short) 10);
        long long31 = nativeArray28.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray28, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray39 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray39, (java.lang.Object) (-1));
        java.lang.Object[] objArray42 = nativeArray36.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeArray36.getParentScope();
        boolean boolean44 = nativeArray28.containsAll((java.util.Collection) nativeArray36);
        java.lang.Object obj45 = nativeArray13.get((int) (byte) -1, (com.google.javascript.rhino.head.Scriptable) nativeArray36);
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int49 = nativeArray47.lastIndexOf((java.lang.Object) (short) 10);
        long long50 = nativeArray47.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray47, "", true);
        boolean boolean54 = nativeArray47.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable58 = nativeArray57.getParentScope();
        java.lang.Object[] objArray59 = nativeArray57.getIds();
        boolean boolean60 = nativeArray57.isEmpty();
        boolean boolean61 = nativeArray47.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray57);
        boolean boolean63 = nativeArray57.isConst("object");
        nativeArray36.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray57);
        java.lang.Object[] objArray65 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray36);
        com.google.javascript.rhino.head.NativeArray nativeArray68 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        java.lang.Object[] objArray69 = nativeArray68.getIds();
        nativeArray68.setAttributes("", 0);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray36, "", (java.lang.Object) nativeArray68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[null]");
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(scriptable58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray2 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int4 = nativeArray2.lastIndexOf((java.lang.Object) (short) 10);
        long long5 = nativeArray2.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray2, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable9 = null;
        java.lang.Object[] objArray10 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable9);
        java.lang.Object[] objArray11 = nativeArray2.toArray(objArray10);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int16 = nativeArray14.lastIndexOf((java.lang.Object) (short) 10);
        long long17 = nativeArray14.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray14, "", true);
        boolean boolean21 = nativeArray14.hasPrototypeMap();
        int int22 = nativeArray14.size();
        boolean boolean23 = nativeArray14.isEmpty();
        boolean boolean25 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray14, "Array");
        java.lang.Object obj26 = nativeArray2.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray14);
        nativeArray2.setAttributes("Array", 1);
        int int30 = nativeArray2.size();
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable33 = nativeArray32.getParentScope();
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.activatePrototypeMap((int) (short) 100);
        com.google.javascript.rhino.head.Scriptable scriptable40 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray36, "");
        boolean boolean41 = nativeArray32.has(100, scriptable40);
        java.lang.String str42 = nativeArray32.getClassName();
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray47, "", (java.lang.Object) 100);
        java.lang.Object obj51 = nativeArray44.associateValue((java.lang.Object) ' ', (java.lang.Object) nativeArray47);
        java.lang.Object obj52 = nativeArray32.getAssociatedValue(obj51);
        int int53 = nativeArray2.lastIndexOf((java.lang.Object) nativeArray32);
        java.lang.Object obj55 = nativeArray2.get((java.lang.Object) '#');
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        long long61 = nativeArray58.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray58, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable65 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.lang.Object[] objArray66 = nativeArray58.getAllIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, (com.google.javascript.rhino.head.Scriptable) nativeArray2, "Array", objArray66);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError: Array is not a function, it is object.");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertNull(scriptable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Array" + "'", str42, "Array");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertNull(scriptable65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[length]");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray6 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int8 = nativeArray6.lastIndexOf((java.lang.Object) (short) 10);
        long long9 = nativeArray6.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray6, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray17, (java.lang.Object) (-1));
        java.lang.Object[] objArray20 = nativeArray14.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable21 = nativeArray14.getParentScope();
        boolean boolean22 = nativeArray6.containsAll((java.util.Collection) nativeArray14);
        com.google.javascript.rhino.head.Scriptable scriptable23 = nativeArray14.getParentScope();
        boolean boolean24 = nativeArray4.containsAll((java.util.Collection) nativeArray14);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray29, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray34.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj37 = nativeArray29.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray34);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int42 = nativeArray40.lastIndexOf((java.lang.Object) (short) 10);
        long long43 = nativeArray40.getLength();
        nativeArray40.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray49.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray52, (java.lang.Object) (-1));
        java.lang.Object[] objArray55 = nativeArray49.getAllIds();
        nativeArray49.delete("");
        java.lang.Object obj58 = nativeArray34.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray49);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable61 = nativeArray34.getPrototype();
        com.google.javascript.rhino.head.Context context62 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int66 = nativeArray64.lastIndexOf((java.lang.Object) (short) 10);
        long long67 = nativeArray64.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray64, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray75 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray72.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray75, (java.lang.Object) (-1));
        java.lang.Object[] objArray78 = nativeArray72.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable79 = nativeArray72.getParentScope();
        boolean boolean80 = nativeArray64.containsAll((java.util.Collection) nativeArray72);
        nativeArray34.defineOwnProperties(context62, (com.google.javascript.rhino.head.ScriptableObject) nativeArray64);
        java.lang.Object obj83 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "");
        nativeArray1.put("", (com.google.javascript.rhino.head.Scriptable) nativeArray14, (java.lang.Object) nativeArray34);
        // The following exception was thrown during execution in test generation
        try {
            nativeArray34.setAttributes(5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[null]");
        org.junit.Assert.assertNull(scriptable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(scriptable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[length]");
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[null]");
        org.junit.Assert.assertNull(scriptable79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray13.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray16, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj24 = nativeArray16.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int29 = nativeArray27.lastIndexOf((java.lang.Object) (short) 10);
        long long30 = nativeArray27.getLength();
        nativeArray27.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray39 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray39, (java.lang.Object) (-1));
        java.lang.Object[] objArray42 = nativeArray36.getAllIds();
        nativeArray36.delete("");
        java.lang.Object obj45 = nativeArray21.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray36);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable48 = nativeArray21.getPrototype();
        com.google.javascript.rhino.head.Context context49 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int53 = nativeArray51.lastIndexOf((java.lang.Object) (short) 10);
        long long54 = nativeArray51.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray51, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray59 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray62 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray59.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray62, (java.lang.Object) (-1));
        java.lang.Object[] objArray65 = nativeArray59.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable66 = nativeArray59.getParentScope();
        boolean boolean67 = nativeArray51.containsAll((java.util.Collection) nativeArray59);
        nativeArray21.defineOwnProperties(context49, (com.google.javascript.rhino.head.ScriptableObject) nativeArray51);
        java.lang.Object obj69 = nativeArray1.get((int) ' ', (com.google.javascript.rhino.head.Scriptable) nativeArray51);
        boolean boolean71 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        java.lang.Object[] objArray72 = nativeArray1.toArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[length]");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(scriptable48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[null]");
        org.junit.Assert.assertNull(scriptable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[null]");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        java.lang.String str34 = nativeArray24.getTypeOf();
        nativeArray24.preventExtensions();
        java.util.ListIterator listIterator36 = nativeArray24.listIterator();
        boolean boolean37 = nativeArray24.isEmpty();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "object" + "'", str34, "object");
        org.junit.Assert.assertNotNull(listIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        int int40 = nativeArray4.indexOf((java.lang.Object) 100.0f);
        boolean boolean41 = nativeArray4.isEmpty();
        long long42 = nativeArray4.getLength();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        com.google.javascript.rhino.head.Scriptable scriptable24 = nativeArray1.getPrototype();
        com.google.javascript.rhino.head.Context context25 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int29 = nativeArray27.lastIndexOf((java.lang.Object) (short) 10);
        long long30 = nativeArray27.getLength();
        nativeArray27.delete((int) (byte) 1);
        boolean boolean33 = nativeArray27.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable37 = nativeArray36.getParentScope();
        java.lang.Object[] objArray38 = nativeArray36.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray27, "", (java.lang.Object) nativeArray36, 0);
        java.lang.Object[] objArray41 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray36);
        boolean boolean43 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray36, (int) '4');
        java.lang.Object obj47 = nativeArray36.getGetterOrSetter("hi!", (int) (byte) 0, false);
        nativeArray1.defineOwnProperties(context25, (com.google.javascript.rhino.head.ScriptableObject) nativeArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = nativeArray1.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(scriptable24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray3 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int5 = nativeArray3.lastIndexOf((java.lang.Object) (short) 10);
        long long6 = nativeArray3.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray3, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray11.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray14, (java.lang.Object) (-1));
        java.lang.Object[] objArray17 = nativeArray11.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable18 = nativeArray11.getParentScope();
        boolean boolean19 = nativeArray3.containsAll((java.util.Collection) nativeArray11);
        com.google.javascript.rhino.head.Scriptable scriptable20 = nativeArray11.getParentScope();
        boolean boolean21 = nativeArray1.containsAll((java.util.Collection) nativeArray11);
        nativeArray1.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[null]");
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(scriptable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        nativeArray1.sealObject();
        nativeArray1.preventExtensions();
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(scriptable19);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray7 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray4.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray7, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj15 = nativeArray7.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.Callable callable18 = null;
        nativeArray7.setGetterOrSetter("hi!", 0, callable18, false);
        nativeArray1.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray7, (int) (short) 10);
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object");
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        com.google.javascript.rhino.head.Scriptable scriptable27 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = nativeArray1.getAssociatedValue(obj28);
        java.lang.Integer[] intArray30 = nativeArray1.getIndexIds();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(scriptable27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeArray10.getParentScope();
        java.lang.Object[] objArray12 = nativeArray10.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", (java.lang.Object) nativeArray10, 0);
        nativeArray1.setAttributes("hi!", 10);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        nativeArray1.defineProperty("object", (java.lang.Object) 1L, method20, method21, 13);
        java.lang.Integer[] intArray24 = nativeArray1.getIndexIds();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable2 = nativeArray1.getParentScope();
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray5.activatePrototypeMap((int) (short) 100);
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray5, "");
        boolean boolean10 = nativeArray1.has(100, scriptable9);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int14 = nativeArray12.lastIndexOf((java.lang.Object) (short) 10);
        long long15 = nativeArray12.getLength();
        nativeArray12.delete((int) (byte) 1);
        boolean boolean18 = nativeArray12.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable22 = nativeArray21.getParentScope();
        java.lang.Object[] objArray23 = nativeArray21.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray12, "", (java.lang.Object) nativeArray21, 0);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray28.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray31, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj39 = nativeArray31.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray36);
        boolean boolean40 = nativeArray31.hasPrototypeMap();
        java.lang.Object[] objArray41 = nativeArray31.getIds();
        int int42 = nativeArray31.size();
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int46 = nativeArray44.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray31.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray44);
        java.lang.Object obj48 = nativeArray12.get((int) (short) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray44);
        com.google.javascript.rhino.head.Scriptable scriptable49 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray44);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray44);
        java.lang.Object[] objArray51 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray44);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray54.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray57, (java.lang.Object) (-1));
        java.lang.Object obj63 = nativeArray57.getGetterOrSetter("object", (int) (short) 0, true);
        nativeArray57.setAttributes((int) (short) -1, 4);
        boolean boolean67 = nativeArray57.avoidObjectDetection();
        // The following exception was thrown during execution in test generation
        try {
            int int68 = nativeArray44.getAttributes("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray57);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property hi! not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable2);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[hi!]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(scriptable49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray4);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int44 = nativeArray42.lastIndexOf((java.lang.Object) (short) 10);
        long long45 = nativeArray42.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray42, "", true);
        boolean boolean49 = nativeArray42.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) (-1));
        java.lang.Object[] objArray57 = nativeArray51.getAllIds();
        nativeArray51.delete("");
        boolean boolean60 = nativeArray42.contains((java.lang.Object) "");
        boolean boolean61 = nativeArray4.has("object", (com.google.javascript.rhino.head.Scriptable) nativeArray42);
        nativeArray4.setAttributes(2, (int) (short) 0);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject65 = null;
        // The following exception was thrown during execution in test generation
        try {
            nativeArray4.initPrototypeConstructor(idFunctionObject65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[length]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray2 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray2.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray5, (java.lang.Object) (-1));
        java.lang.Object[] objArray8 = nativeArray2.getAllIds();
        nativeArray2.delete("");
        long long11 = nativeArray2.getLength();
        com.google.javascript.rhino.head.Scriptable scriptable13 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray2, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray19 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray19, (java.lang.Object) (-1));
        boolean boolean22 = nativeArray19.isEmpty();
        nativeArray19.activatePrototypeMap(2);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int28 = nativeArray26.lastIndexOf((java.lang.Object) (short) 10);
        long long29 = nativeArray26.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray26, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable33 = null;
        java.lang.Object[] objArray34 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable33);
        java.lang.Object[] objArray35 = nativeArray26.toArray(objArray34);
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int40 = nativeArray38.lastIndexOf((java.lang.Object) (short) 10);
        long long41 = nativeArray38.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray38, "", true);
        boolean boolean45 = nativeArray38.hasPrototypeMap();
        int int46 = nativeArray38.size();
        boolean boolean47 = nativeArray38.isEmpty();
        boolean boolean49 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray38, "Array");
        java.lang.Object obj50 = nativeArray26.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray38);
        com.google.javascript.rhino.head.NativeArray nativeArray53 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int55 = nativeArray53.lastIndexOf((java.lang.Object) (short) 10);
        long long56 = nativeArray53.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray53, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray61 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray61.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray64, (java.lang.Object) (-1));
        java.lang.Object[] objArray67 = nativeArray61.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable68 = nativeArray61.getParentScope();
        boolean boolean69 = nativeArray53.containsAll((java.util.Collection) nativeArray61);
        java.lang.Object obj70 = nativeArray38.get((int) (byte) -1, (com.google.javascript.rhino.head.Scriptable) nativeArray61);
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int74 = nativeArray72.lastIndexOf((java.lang.Object) (short) 10);
        long long75 = nativeArray72.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray72, "", true);
        boolean boolean79 = nativeArray72.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray82 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable83 = nativeArray82.getParentScope();
        java.lang.Object[] objArray84 = nativeArray82.getIds();
        boolean boolean85 = nativeArray82.isEmpty();
        boolean boolean86 = nativeArray72.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray82);
        boolean boolean88 = nativeArray82.isConst("object");
        nativeArray61.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray82);
        java.lang.Object[] objArray90 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray61);
        java.lang.Object[] objArray91 = nativeArray19.toArray(objArray90);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj92 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, (com.google.javascript.rhino.head.Scriptable) nativeArray2, "hi!", objArray91);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EcmaError; message: TypeError: hi! is not a function, it is object.");
        } catch (com.google.javascript.rhino.head.EcmaError e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[length]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNull(scriptable13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[null]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[null]");
        org.junit.Assert.assertNull(scriptable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(scriptable83);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[]");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[null]");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int24 = nativeArray22.lastIndexOf((java.lang.Object) (short) 10);
        long long25 = nativeArray22.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "", true);
        boolean boolean29 = nativeArray22.hasPrototypeMap();
        int int30 = nativeArray22.size();
        boolean boolean31 = nativeArray22.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable32 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray22);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable36 = nativeArray22.getParentScope();
        java.lang.Object obj38 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray22, (java.lang.Object) 0.0f);
        boolean boolean39 = nativeArray4.contains((java.lang.Object) 0.0f);
        boolean boolean40 = nativeArray4.isSealed();
        boolean boolean42 = nativeArray4.isConst("");
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int46 = nativeArray44.lastIndexOf((java.lang.Object) (short) 10);
        long long47 = nativeArray44.getLength();
        nativeArray44.delete((int) (byte) 1);
        java.lang.Integer[] intArray50 = nativeArray44.getIndexIds();
        java.lang.Object obj52 = null;
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray44, "hi!", obj52);
        java.lang.Object obj55 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray44, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int59 = nativeArray57.lastIndexOf((java.lang.Object) (short) 10);
        long long60 = nativeArray57.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray57, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable64 = null;
        java.lang.Object[] objArray65 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable64);
        java.lang.Object[] objArray66 = nativeArray57.toArray(objArray65);
        com.google.javascript.rhino.head.Scriptable scriptable67 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray57);
        boolean boolean68 = nativeArray44.contains((java.lang.Object) nativeArray57);
        com.google.javascript.rhino.head.Scriptable scriptable69 = nativeArray44.getPrototype();
        int int70 = nativeArray4.lastIndexOf((java.lang.Object) scriptable69);
        java.lang.Object obj74 = nativeArray4.getGetterOrSetter("hi!", 0, true);
        java.util.Iterator iterator75 = nativeArray4.iterator();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(scriptable32);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[null]");
        org.junit.Assert.assertNotNull(scriptable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(scriptable69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(iterator75);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable36 = nativeArray9.getPrototype();
        com.google.javascript.rhino.head.NativeArray nativeArray39 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray39.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray42, (java.lang.Object) (-1));
        java.lang.Object[] objArray45 = nativeArray39.getAllIds();
        nativeArray39.delete("");
        long long48 = nativeArray39.getLength();
        boolean boolean50 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray39, (int) (short) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray53 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray53.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray56, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray61 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray61.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj64 = nativeArray56.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray61);
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int69 = nativeArray67.lastIndexOf((java.lang.Object) (short) 10);
        long long70 = nativeArray67.getLength();
        nativeArray67.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray61, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray76 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray79 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray76.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray79, (java.lang.Object) (-1));
        java.lang.Object[] objArray82 = nativeArray76.getAllIds();
        nativeArray76.delete("");
        java.lang.Object obj85 = nativeArray61.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray76);
        java.lang.Integer[] intArray86 = nativeArray76.getIndexIds();
        nativeArray39.defineProperty("", (java.lang.Object) nativeArray76, 10);
        nativeArray9.setAttributes(101, (com.google.javascript.rhino.head.Scriptable) nativeArray76, 0);
        com.google.javascript.rhino.head.Scriptable scriptable91 = nativeArray76.getPrototype();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[length]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[length]");
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertNull(scriptable91);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean8 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        java.lang.String str9 = nativeArray1.getTypeOf();
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray15.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray18, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj26 = nativeArray18.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray23);
        com.google.javascript.rhino.head.Callable callable29 = null;
        nativeArray18.setGetterOrSetter("hi!", 0, callable29, false);
        nativeArray12.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray18, (int) (short) 10);
        boolean boolean35 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray12, "object");
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", (java.lang.Object) "object");
        boolean boolean38 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 13);
        java.util.ListIterator listIterator39 = nativeArray1.listIterator();
        com.google.javascript.rhino.head.Scriptable scriptable40 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        nativeArray1.delete((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "object" + "'", str9, "object");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(listIterator39);
        org.junit.Assert.assertNull(scriptable40);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray15, (java.lang.Object) (-1));
        java.lang.Object[] objArray18 = nativeArray12.getAllIds();
        nativeArray12.delete("");
        long long21 = nativeArray12.getLength();
        boolean boolean22 = nativeArray1.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int27 = nativeArray25.lastIndexOf((java.lang.Object) (short) 10);
        long long28 = nativeArray25.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray25, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray36, (java.lang.Object) (-1));
        java.lang.Object[] objArray39 = nativeArray33.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable40 = nativeArray33.getParentScope();
        boolean boolean41 = nativeArray25.containsAll((java.util.Collection) nativeArray33);
        com.google.javascript.rhino.head.Scriptable scriptable42 = nativeArray33.getParentScope();
        boolean boolean43 = nativeArray33.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable47 = nativeArray46.getParentScope();
        java.lang.Object[] objArray48 = nativeArray46.getIds();
        boolean boolean49 = nativeArray33.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray46);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray12, "object", (java.lang.Object) nativeArray33);
        com.google.javascript.rhino.head.NativeArray nativeArray53 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int55 = nativeArray53.lastIndexOf((java.lang.Object) (short) 10);
        long long56 = nativeArray53.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray53, "", true);
        boolean boolean60 = nativeArray53.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable64 = nativeArray63.getParentScope();
        java.lang.Object[] objArray65 = nativeArray63.getIds();
        boolean boolean66 = nativeArray63.isEmpty();
        boolean boolean67 = nativeArray53.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray63);
        java.lang.Object[] objArray68 = nativeArray53.getIds();
        nativeArray12.defineConst("object", (com.google.javascript.rhino.head.Scriptable) nativeArray53);
        com.google.javascript.rhino.head.Scriptable scriptable71 = null;
        nativeArray12.defineConst("object", scriptable71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = nativeArray12.get(11L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[length]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[null]");
        org.junit.Assert.assertNull(scriptable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(scriptable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(scriptable47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(scriptable64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        java.lang.Integer[] intArray7 = nativeArray1.getIndexIds();
        java.lang.Object obj9 = null;
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", obj9);
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray1, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray17, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray22.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray25, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray30.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj33 = nativeArray25.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int38 = nativeArray36.lastIndexOf((java.lang.Object) (short) 10);
        long long39 = nativeArray36.getLength();
        nativeArray36.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray45.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray48, (java.lang.Object) (-1));
        java.lang.Object[] objArray51 = nativeArray45.getAllIds();
        nativeArray45.delete("");
        java.lang.Object obj54 = nativeArray30.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable57 = nativeArray30.getPrototype();
        com.google.javascript.rhino.head.Context context58 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int62 = nativeArray60.lastIndexOf((java.lang.Object) (short) 10);
        long long63 = nativeArray60.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray60, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray68 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray71 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray68.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray71, (java.lang.Object) (-1));
        java.lang.Object[] objArray74 = nativeArray68.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable75 = nativeArray68.getParentScope();
        boolean boolean76 = nativeArray60.containsAll((java.util.Collection) nativeArray68);
        nativeArray30.defineOwnProperties(context58, (com.google.javascript.rhino.head.ScriptableObject) nativeArray60);
        nativeArray14.setAttributes(1, (com.google.javascript.rhino.head.Scriptable) nativeArray30, (int) (short) 10);
        java.lang.Object obj80 = nativeArray1.getAssociatedValue((java.lang.Object) nativeArray30);
        nativeArray30.delete((int) (short) 0);
        java.lang.Object obj84 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, (int) (short) 1);
        com.google.javascript.rhino.head.Scriptable scriptable85 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[length]");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[null]");
        org.junit.Assert.assertNull(scriptable75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNull(scriptable85);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        nativeArray11.preventExtensions();
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        com.google.javascript.rhino.head.Callable callable39 = null;
        nativeArray28.setGetterOrSetter("hi!", 0, callable39, false);
        nativeArray22.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray28, (int) (short) 10);
        boolean boolean45 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "object");
        nativeArray11.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray22);
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int50 = nativeArray48.lastIndexOf((java.lang.Object) (short) 10);
        long long51 = nativeArray48.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray48, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray59 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray56.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray59, (java.lang.Object) (-1));
        java.lang.Object[] objArray62 = nativeArray56.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable63 = nativeArray56.getParentScope();
        boolean boolean64 = nativeArray48.containsAll((java.util.Collection) nativeArray56);
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int69 = nativeArray67.lastIndexOf((java.lang.Object) (short) 10);
        long long70 = nativeArray67.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray67, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable74 = null;
        java.lang.Object[] objArray75 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable74);
        java.lang.Object[] objArray76 = nativeArray67.toArray(objArray75);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray48, "hi!", (java.lang.Object) objArray75);
        nativeArray48.activatePrototypeMap((int) (byte) 10);
        nativeArray11.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[null]");
        org.junit.Assert.assertNull(scriptable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[null]");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj20 = nativeArray12.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray17);
        boolean boolean21 = nativeArray12.hasPrototypeMap();
        java.lang.Object[] objArray22 = nativeArray12.getIds();
        int int23 = nativeArray12.size();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        boolean boolean37 = nativeArray28.hasPrototypeMap();
        java.lang.Object[] objArray38 = nativeArray28.getIds();
        int int39 = nativeArray28.size();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray50.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj53 = nativeArray45.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        boolean boolean54 = nativeArray45.hasPrototypeMap();
        java.lang.Object[] objArray55 = nativeArray45.getIds();
        int int56 = nativeArray45.size();
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray45.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.lang.Object obj62 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        boolean boolean63 = nativeArray12.containsAll((java.util.Collection) nativeArray45);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.Scriptable scriptable65 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.Scriptable scriptable66 = nativeArray1.getPrototype();
        java.lang.Object[] objArray67 = nativeArray1.getIds();
        com.google.javascript.rhino.head.NativeArray nativeArray68 = new com.google.javascript.rhino.head.NativeArray(objArray67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(scriptable65);
        org.junit.Assert.assertNull(scriptable66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.activatePrototypeMap((int) (short) 100);
        com.google.javascript.rhino.head.Scriptable scriptable4 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        java.lang.Object obj6 = nativeArray1.get((long) (short) 0);
        boolean boolean7 = nativeArray1.isEmpty();
        org.junit.Assert.assertNull(scriptable4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable2 = nativeArray1.getParentScope();
        java.lang.Object[] objArray3 = nativeArray1.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray5.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray8, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray13.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj16 = nativeArray8.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray13);
        java.lang.Object obj17 = nativeArray1.getAssociatedValue((java.lang.Object) nativeArray8);
        com.google.javascript.rhino.head.Scriptable scriptable18 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        nativeArray1.delete(2);
        int int21 = nativeArray1.size();
        java.lang.String str22 = nativeArray1.getClassName();
        java.lang.Object[] objArray23 = nativeArray1.toArray();
        org.junit.Assert.assertNull(scriptable2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[length]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Array" + "'", str22, "Array");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "", true);
        boolean boolean22 = nativeArray15.hasPrototypeMap();
        java.util.ListIterator listIterator23 = nativeArray15.listIterator();
        boolean boolean24 = nativeArray1.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray15);
        int int26 = nativeArray1.indexOf((java.lang.Object) ' ');
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable30 = nativeArray29.getParentScope();
        java.lang.Object[] objArray31 = nativeArray29.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray36, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray41.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj44 = nativeArray36.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray41);
        java.lang.Object obj45 = nativeArray29.getAssociatedValue((java.lang.Object) nativeArray36);
        com.google.javascript.rhino.head.Scriptable scriptable46 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray29);
        nativeArray29.delete(2);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray29, "Array");
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray29);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", (java.lang.Object) nativeArray29);
        java.lang.String str53 = nativeArray29.getTypeOf();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[length]");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(scriptable46);
        org.junit.Assert.assertNotNull(scriptable51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "object" + "'", str53, "object");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        nativeArray1.delete("");
        long long10 = nativeArray1.getLength();
        java.util.ListIterator listIterator11 = nativeArray1.listIterator();
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray17, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray22.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray25, (java.lang.Object) (-1));
        nativeArray14.put((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray22, (java.lang.Object) 100L);
        java.lang.Object obj31 = nativeArray22.get((long) (byte) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray36, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int42 = nativeArray40.lastIndexOf((java.lang.Object) (short) 10);
        long long43 = nativeArray40.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray40, "", true);
        boolean boolean47 = nativeArray40.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable51 = nativeArray50.getParentScope();
        java.lang.Object[] objArray52 = nativeArray50.getIds();
        boolean boolean53 = nativeArray50.isEmpty();
        boolean boolean54 = nativeArray40.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        boolean boolean55 = nativeArray33.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray40);
        nativeArray22.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray40);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", (java.lang.Object) nativeArray40);
        boolean boolean58 = nativeArray40.avoidObjectDetection();
        com.google.javascript.rhino.head.Scriptable scriptable59 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray40);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(listIterator11);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100L + "'", obj31, 100L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(scriptable59);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray4);
        boolean boolean41 = nativeArray4.isConst("hi!");
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int46 = nativeArray44.lastIndexOf((java.lang.Object) (short) 10);
        long long47 = nativeArray44.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray44, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable51 = null;
        java.lang.Object[] objArray52 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable51);
        java.lang.Object[] objArray53 = nativeArray44.toArray(objArray52);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int58 = nativeArray56.lastIndexOf((java.lang.Object) (short) 10);
        long long59 = nativeArray56.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray56, "", true);
        boolean boolean63 = nativeArray56.hasPrototypeMap();
        int int64 = nativeArray56.size();
        boolean boolean65 = nativeArray56.isEmpty();
        boolean boolean67 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray56, "Array");
        java.lang.Object obj68 = nativeArray44.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray56);
        java.lang.Object obj69 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray56);
        com.google.javascript.rhino.head.Scriptable scriptable70 = nativeArray4.getParentScope();
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int74 = nativeArray72.lastIndexOf((java.lang.Object) (short) 10);
        long long75 = nativeArray72.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray72, "", true);
        boolean boolean79 = nativeArray72.hasPrototypeMap();
        int int80 = nativeArray72.size();
        boolean boolean81 = nativeArray72.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable82 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray72);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray72, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable86 = nativeArray72.getParentScope();
        java.lang.Object obj88 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray72, (java.lang.Object) 0.0f);
        java.lang.Object obj89 = nativeArray4.get((java.lang.Object) 0.0f);
        java.lang.Object obj91 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, (int) (short) 1);
        java.lang.Object obj93 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, "");
        java.util.ListIterator listIterator94 = nativeArray4.listIterator();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNull(scriptable70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(scriptable82);
        org.junit.Assert.assertNull(scriptable86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertNotNull(listIterator94);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        nativeArray11.preventExtensions();
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        com.google.javascript.rhino.head.Callable callable39 = null;
        nativeArray28.setGetterOrSetter("hi!", 0, callable39, false);
        nativeArray22.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray28, (int) (short) 10);
        boolean boolean45 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "object");
        nativeArray11.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray22);
        java.lang.Object obj47 = null;
        int int48 = nativeArray11.lastIndexOf(obj47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = nativeArray11.get(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(scriptable12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        java.lang.String str8 = nativeArray1.getTypeOf();
        int int9 = nativeArray1.size();
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int13 = nativeArray11.lastIndexOf((java.lang.Object) (short) 10);
        long long14 = nativeArray11.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray11, "", true);
        boolean boolean18 = nativeArray11.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable22 = nativeArray21.getParentScope();
        java.lang.Object[] objArray23 = nativeArray21.getIds();
        boolean boolean24 = nativeArray21.isEmpty();
        boolean boolean25 = nativeArray11.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        boolean boolean27 = nativeArray21.isConst("object");
        java.lang.Object obj29 = nativeArray21.get((java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.Scriptable scriptable30 = null;
        nativeArray21.setParentScope(scriptable30);
        nativeArray1.setPrototype(scriptable30);
        long long33 = nativeArray1.jsGet_length();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "object" + "'", str8, "object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(scriptable22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        com.google.javascript.rhino.head.Scriptable scriptable36 = nativeArray9.getPrototype();
        com.google.javascript.rhino.head.Context context37 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray39 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int41 = nativeArray39.lastIndexOf((java.lang.Object) (short) 10);
        long long42 = nativeArray39.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray39, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray47.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray50, (java.lang.Object) (-1));
        java.lang.Object[] objArray53 = nativeArray47.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable54 = nativeArray47.getParentScope();
        boolean boolean55 = nativeArray39.containsAll((java.util.Collection) nativeArray47);
        nativeArray9.defineOwnProperties(context37, (com.google.javascript.rhino.head.ScriptableObject) nativeArray39);
        java.lang.Object obj58 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "");
        java.util.ListIterator listIterator60 = nativeArray9.listIterator((int) (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertNull(scriptable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(listIterator60);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        java.lang.Object[] objArray15 = nativeArray9.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable16 = nativeArray9.getParentScope();
        boolean boolean17 = nativeArray1.containsAll((java.util.Collection) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int22 = nativeArray20.lastIndexOf((java.lang.Object) (short) 10);
        long long23 = nativeArray20.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray20, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable27 = null;
        java.lang.Object[] objArray28 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable27);
        java.lang.Object[] objArray29 = nativeArray20.toArray(objArray28);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", (java.lang.Object) objArray28);
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNull(scriptable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.delete((-1));
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray5.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray8, (java.lang.Object) (-1));
        java.lang.Object[] objArray11 = nativeArray5.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable12 = nativeArray5.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable13 = nativeArray5.getParentScope();
        boolean boolean14 = nativeArray5.isSealed();
        java.lang.Object obj16 = nativeArray5.get(0L);
        long long17 = nativeArray5.getLength();
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int22 = nativeArray20.lastIndexOf((java.lang.Object) (short) 10);
        long long23 = nativeArray20.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray20, "", true);
        boolean boolean27 = nativeArray20.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable31 = nativeArray30.getParentScope();
        java.lang.Object[] objArray32 = nativeArray30.getIds();
        boolean boolean33 = nativeArray30.isEmpty();
        boolean boolean34 = nativeArray20.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        boolean boolean36 = nativeArray30.isConst("object");
        java.lang.Object obj38 = nativeArray30.get((java.lang.Object) (byte) 10);
        nativeArray30.preventExtensions();
        boolean boolean40 = nativeArray5.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        int int41 = nativeArray1.lastIndexOf((java.lang.Object) nativeArray5);
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray44.activatePrototypeMap((int) (short) 100);
        boolean boolean47 = nativeArray5.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray44);
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray5, "object", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.Scriptable scriptable53 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray5, "hi!");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(scriptable12);
        org.junit.Assert.assertNull(scriptable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(scriptable31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(scriptable53);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        nativeArray1.put((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray9, (java.lang.Object) 100L);
        java.lang.Object obj18 = nativeArray9.get((long) (byte) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int23 = nativeArray21.lastIndexOf((java.lang.Object) (short) 10);
        long long24 = nativeArray21.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray29.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray32, (java.lang.Object) (-1));
        java.lang.Object[] objArray35 = nativeArray29.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable36 = nativeArray29.getParentScope();
        boolean boolean37 = nativeArray21.containsAll((java.util.Collection) nativeArray29);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int42 = nativeArray40.lastIndexOf((java.lang.Object) (short) 10);
        long long43 = nativeArray40.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray40, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable47 = null;
        java.lang.Object[] objArray48 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable47);
        java.lang.Object[] objArray49 = nativeArray40.toArray(objArray48);
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "hi!", (java.lang.Object) objArray48);
        nativeArray21.activatePrototypeMap((int) (byte) 10);
        com.google.javascript.rhino.head.Scriptable scriptable54 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray21, "Array");
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        nativeArray9.defineProperty("Array", (java.lang.Object) "Array", method55, method56, 1);
        com.google.javascript.rhino.head.NativeArray nativeArray61 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable62 = nativeArray61.getParentScope();
        java.lang.Object[] objArray63 = nativeArray61.getIds();
        boolean boolean64 = nativeArray61.isEmpty();
        java.lang.Object obj66 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray61, 8);
        com.google.javascript.rhino.head.NativeArray nativeArray68 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray71 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray68.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray71, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable74 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray68);
        com.google.javascript.rhino.head.NativeArray nativeArray76 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray79 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray76.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray79, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable82 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray76);
        nativeArray68.setPrototype(scriptable82);
        int int84 = nativeArray61.lastIndexOf((java.lang.Object) scriptable82);
        boolean boolean85 = nativeArray9.has(5, (com.google.javascript.rhino.head.Scriptable) nativeArray61);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100L + "'", obj18, 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[null]");
        org.junit.Assert.assertNull(scriptable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[null]");
        org.junit.Assert.assertNull(scriptable54);
        org.junit.Assert.assertNull(scriptable62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNull(scriptable74);
        org.junit.Assert.assertNull(scriptable82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Context context15 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int19 = nativeArray17.lastIndexOf((java.lang.Object) (short) 10);
        long long20 = nativeArray17.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray17, "", true);
        boolean boolean24 = nativeArray17.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable28 = nativeArray27.getParentScope();
        java.lang.Object[] objArray29 = nativeArray27.getIds();
        boolean boolean30 = nativeArray27.isEmpty();
        boolean boolean31 = nativeArray17.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray27);
        boolean boolean33 = nativeArray27.isConst("object");
        nativeArray1.defineOwnProperties(context15, (com.google.javascript.rhino.head.ScriptableObject) nativeArray27);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray27, "hi!");
        nativeArray27.sealObject();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray27, "object", true);
        java.lang.Object[] objArray41 = nativeArray27.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray(objArray41);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray(objArray41);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int48 = nativeArray46.lastIndexOf((java.lang.Object) (short) 10);
        long long49 = nativeArray46.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray46, "", true);
        boolean boolean53 = nativeArray46.hasPrototypeMap();
        java.util.ListIterator listIterator54 = nativeArray46.listIterator();
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray57.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray60, (java.lang.Object) (-1));
        java.lang.Object[] objArray63 = nativeArray57.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable64 = nativeArray57.getParentScope();
        com.google.javascript.rhino.head.Context context65 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray70 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray67.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray70, (java.lang.Object) (-1));
        java.lang.Object[] objArray73 = nativeArray67.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable74 = nativeArray67.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable75 = nativeArray67.getParentScope();
        java.util.ListIterator listIterator76 = nativeArray67.listIterator();
        nativeArray57.defineOwnProperties(context65, (com.google.javascript.rhino.head.ScriptableObject) nativeArray67);
        java.lang.Object obj78 = nativeArray46.get(100, (com.google.javascript.rhino.head.Scriptable) nativeArray67);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray67, "", true);
        boolean boolean82 = nativeArray43.has((-1), (com.google.javascript.rhino.head.Scriptable) nativeArray67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scriptable11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(scriptable28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[null]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(listIterator54);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[null]");
        org.junit.Assert.assertNull(scriptable64);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[null]");
        org.junit.Assert.assertNull(scriptable74);
        org.junit.Assert.assertNull(scriptable75);
        org.junit.Assert.assertNotNull(listIterator76);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        java.lang.Object obj3 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray6 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int8 = nativeArray6.lastIndexOf((java.lang.Object) (short) 10);
        long long9 = nativeArray6.getLength();
        nativeArray6.delete((int) (byte) 1);
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray6, "");
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        java.lang.Object[] objArray29 = nativeArray23.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable30 = nativeArray23.getParentScope();
        boolean boolean31 = nativeArray15.containsAll((java.util.Collection) nativeArray23);
        boolean boolean32 = nativeArray6.containsAll((java.util.Collection) nativeArray15);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        long long37 = nativeArray34.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        java.lang.Object[] objArray48 = nativeArray42.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable49 = nativeArray42.getParentScope();
        boolean boolean50 = nativeArray34.containsAll((java.util.Collection) nativeArray42);
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int54 = nativeArray52.lastIndexOf((java.lang.Object) (short) 10);
        long long55 = nativeArray52.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray52, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray60.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray63, (java.lang.Object) (-1));
        java.lang.Object[] objArray66 = nativeArray60.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable67 = nativeArray60.getParentScope();
        boolean boolean68 = nativeArray52.containsAll((java.util.Collection) nativeArray60);
        com.google.javascript.rhino.head.NativeArray nativeArray70 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray73 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray70.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray73, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray78 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray78.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj81 = nativeArray73.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray78);
        boolean boolean82 = nativeArray73.hasPrototypeMap();
        java.lang.Object[] objArray83 = nativeArray73.getIds();
        java.lang.Object[] objArray84 = nativeArray60.toArray(objArray83);
        java.lang.Object obj85 = nativeArray6.associateValue((java.lang.Object) boolean50, (java.lang.Object) nativeArray60);
        com.google.javascript.rhino.head.Scriptable scriptable86 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray60);
        boolean boolean87 = nativeArray1.has("hi!", scriptable86);
        boolean boolean88 = nativeArray1.avoidObjectDetection();
        boolean boolean89 = nativeArray1.isEmpty();
        nativeArray1.delete("");
        java.lang.Object[] objArray92 = nativeArray1.getIds();
        java.lang.String str93 = nativeArray1.getClassName();
        java.lang.Object obj94 = null;
        java.lang.Object obj95 = nativeArray1.get(obj94);
        java.lang.Object obj99 = nativeArray1.getGetterOrSetter("hi!", 0, false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[null]");
        org.junit.Assert.assertNull(scriptable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[null]");
        org.junit.Assert.assertNull(scriptable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[null]");
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[null]");
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(scriptable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[]");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Array" + "'", str93, "Array");
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        nativeArray1.sealObject();
        nativeArray1.preventExtensions();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int23 = nativeArray21.lastIndexOf((java.lang.Object) (short) 10);
        long long24 = nativeArray21.getLength();
        nativeArray21.delete((int) (byte) 1);
        boolean boolean28 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "");
        boolean boolean29 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray30 = nativeArray21.getIds();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.IdFunctionObject idFunctionObject32 = nativeArray1.exportAsJSClass(0, (com.google.javascript.rhino.head.Scriptable) nativeArray21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj20 = nativeArray12.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray17);
        boolean boolean21 = nativeArray12.hasPrototypeMap();
        java.lang.Object[] objArray22 = nativeArray12.getIds();
        int int23 = nativeArray12.size();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        boolean boolean37 = nativeArray28.hasPrototypeMap();
        java.lang.Object[] objArray38 = nativeArray28.getIds();
        int int39 = nativeArray28.size();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray50.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj53 = nativeArray45.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        boolean boolean54 = nativeArray45.hasPrototypeMap();
        java.lang.Object[] objArray55 = nativeArray45.getIds();
        int int56 = nativeArray45.size();
        com.google.javascript.rhino.head.NativeArray nativeArray58 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int60 = nativeArray58.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray45.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray58);
        java.lang.Object obj62 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray45);
        boolean boolean63 = nativeArray12.containsAll((java.util.Collection) nativeArray45);
        nativeArray1.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        java.lang.Integer[] intArray65 = nativeArray1.getIndexIds();
        boolean boolean66 = nativeArray1.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray68 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int70 = nativeArray68.lastIndexOf((java.lang.Object) (short) 10);
        long long71 = nativeArray68.getLength();
        nativeArray68.delete((int) (byte) 1);
        boolean boolean74 = nativeArray68.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray77 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable78 = nativeArray77.getParentScope();
        java.lang.Object[] objArray79 = nativeArray77.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray68, "", (java.lang.Object) nativeArray77, 0);
        java.lang.Object[] objArray82 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray77);
        boolean boolean84 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray77, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = nativeArray1.remove((java.lang.Object) nativeArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(scriptable78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        nativeArray1.delete("");
        long long10 = nativeArray1.getLength();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (short) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray15.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray18, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj26 = nativeArray18.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray23);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int31 = nativeArray29.lastIndexOf((java.lang.Object) (short) 10);
        long long32 = nativeArray29.getLength();
        nativeArray29.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray23, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray38.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray41, (java.lang.Object) (-1));
        java.lang.Object[] objArray44 = nativeArray38.getAllIds();
        nativeArray38.delete("");
        java.lang.Object obj47 = nativeArray23.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray38);
        java.lang.Integer[] intArray48 = nativeArray38.getIndexIds();
        nativeArray1.defineProperty("", (java.lang.Object) nativeArray38, 10);
        java.lang.Object obj52 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray38, (int) (byte) 100);
        boolean boolean53 = nativeArray38.isSealed();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[length]");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray(objArray7);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray(objArray7);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray15, (java.lang.Object) (-1));
        java.lang.Object[] objArray18 = nativeArray12.getAllIds();
        java.lang.String str19 = nativeArray12.getTypeOf();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray29.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj32 = nativeArray24.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray29);
        boolean boolean33 = nativeArray24.hasPrototypeMap();
        java.lang.Object[] objArray34 = nativeArray24.getIds();
        int int35 = nativeArray24.size();
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int39 = nativeArray37.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray24.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray37);
        java.lang.Object[] objArray41 = nativeArray37.getAllIds();
        com.google.javascript.rhino.head.Scriptable scriptable43 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray37, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        java.lang.Object obj47 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray45, "Array");
        boolean boolean49 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray45, "hi!");
        nativeArray37.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray45);
        com.google.javascript.rhino.head.Scriptable scriptable51 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray45);
        java.lang.Object obj53 = nativeArray45.get(0L);
        java.lang.Object obj54 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray12, obj53);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable57 = nativeArray56.getParentScope();
        java.lang.Object[] objArray58 = nativeArray56.getIds();
        boolean boolean59 = nativeArray56.avoidObjectDetection();
        java.lang.Object obj63 = nativeArray56.getGetterOrSetter("", 0, true);
        boolean boolean64 = nativeArray56.avoidObjectDetection();
        nativeArray9.put("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) nativeArray56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = nativeArray12.get((long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[length]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "object" + "'", str19, "object");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[length]");
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(scriptable51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        boolean boolean8 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, "");
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int13 = nativeArray11.lastIndexOf((java.lang.Object) (short) 10);
        long long14 = nativeArray11.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray11, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray19 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray19.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray22, (java.lang.Object) (-1));
        java.lang.Object[] objArray25 = nativeArray19.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable26 = nativeArray19.getParentScope();
        boolean boolean27 = nativeArray11.containsAll((java.util.Collection) nativeArray19);
        com.google.javascript.rhino.head.Scriptable scriptable28 = nativeArray19.getParentScope();
        boolean boolean29 = nativeArray19.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable33 = nativeArray32.getParentScope();
        java.lang.Object[] objArray34 = nativeArray32.getIds();
        boolean boolean35 = nativeArray19.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray32);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        nativeArray4.defineProperty("hi!", (java.lang.Object) nativeArray19, method36, method37, 8);
        nativeArray4.preventExtensions();
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray42, "", (java.lang.Object) 100);
        boolean boolean46 = nativeArray42.avoidObjectDetection();
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray49.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray52, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray57.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj60 = nativeArray52.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray57);
        boolean boolean61 = nativeArray52.hasPrototypeMap();
        java.lang.Object[] objArray62 = nativeArray52.getIds();
        int int63 = nativeArray52.size();
        com.google.javascript.rhino.head.NativeArray nativeArray65 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int67 = nativeArray65.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray52.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray65);
        java.lang.Object[] objArray69 = nativeArray65.getAllIds();
        com.google.javascript.rhino.head.Context context70 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray75 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray72.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray75, (java.lang.Object) (-1));
        java.lang.Object[] objArray78 = nativeArray72.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable79 = nativeArray72.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable80 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray72);
        nativeArray65.defineOwnProperties(context70, (com.google.javascript.rhino.head.ScriptableObject) nativeArray72);
        boolean boolean82 = nativeArray42.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray72);
        int int83 = nativeArray4.indexOf((java.lang.Object) nativeArray42);
        boolean boolean84 = nativeArray4.avoidObjectDetection();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[null]");
        org.junit.Assert.assertNull(scriptable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(scriptable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(scriptable33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[hi!]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[length]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[null]");
        org.junit.Assert.assertNull(scriptable79);
        org.junit.Assert.assertNull(scriptable80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, "", (java.lang.Object) 100);
        java.lang.Object obj8 = nativeArray1.associateValue((java.lang.Object) ' ', (java.lang.Object) nativeArray4);
        boolean boolean10 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, "");
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray13.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray16, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj24 = nativeArray16.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        boolean boolean25 = nativeArray16.hasPrototypeMap();
        java.lang.Object[] objArray26 = nativeArray16.getIds();
        int int27 = nativeArray16.size();
        nativeArray16.sealObject();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray16, "Array", false);
        java.util.ListIterator listIterator32 = nativeArray16.listIterator();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, "Array", (java.lang.Object) listIterator32, (int) (byte) 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[hi!]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(listIterator32);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = nativeArray9.getAttributes((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property -1 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        int int40 = nativeArray4.indexOf((java.lang.Object) 100.0f);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int45 = nativeArray43.lastIndexOf((java.lang.Object) (short) 10);
        long long46 = nativeArray43.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray43, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable50 = null;
        java.lang.Object[] objArray51 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable50);
        java.lang.Object[] objArray52 = nativeArray43.toArray(objArray51);
        com.google.javascript.rhino.head.NativeArray nativeArray55 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int57 = nativeArray55.lastIndexOf((java.lang.Object) (short) 10);
        long long58 = nativeArray55.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray55, "", true);
        boolean boolean62 = nativeArray55.hasPrototypeMap();
        int int63 = nativeArray55.size();
        boolean boolean64 = nativeArray55.isEmpty();
        boolean boolean66 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray55, "Array");
        java.lang.Object obj67 = nativeArray43.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray55);
        nativeArray55.setAttributes("object", (int) (byte) 0);
        boolean boolean71 = nativeArray4.has((int) (byte) 0, (com.google.javascript.rhino.head.Scriptable) nativeArray55);
        com.google.javascript.rhino.head.Scriptable scriptable73 = null;
        boolean boolean74 = nativeArray4.has((int) (byte) -1, scriptable73);
        java.util.Iterator iterator75 = nativeArray4.iterator();
        com.google.javascript.rhino.head.Scriptable scriptable76 = nativeArray4.getPrototype();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[null]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertNull(scriptable76);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        int int40 = nativeArray4.indexOf((java.lang.Object) 100.0f);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray42, "", (java.lang.Object) 100);
        boolean boolean46 = nativeArray42.avoidObjectDetection();
        boolean boolean48 = nativeArray42.isConst("hi!");
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) (-1));
        nativeArray42.setAttributes(0, (com.google.javascript.rhino.head.Scriptable) nativeArray54, (int) (byte) 10);
        int int59 = nativeArray4.lastIndexOf((java.lang.Object) nativeArray54);
        java.lang.Object[] objArray60 = nativeArray4.getIds();
        nativeArray4.setAttributes("hi!", 2);
        com.google.javascript.rhino.head.NativeArray nativeArray65 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int67 = nativeArray65.lastIndexOf((java.lang.Object) (short) 10);
        long long68 = nativeArray65.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray65, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable72 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray65);
        java.lang.Object[] objArray73 = nativeArray65.getAllIds();
        java.util.ListIterator listIterator74 = nativeArray65.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = nativeArray4.add((java.lang.Object) listIterator74);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[hi!]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNull(scriptable72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[length]");
        org.junit.Assert.assertNotNull(listIterator74);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable7 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int11 = nativeArray9.lastIndexOf((java.lang.Object) (short) 10);
        long long12 = nativeArray9.getLength();
        nativeArray9.delete((int) (byte) 1);
        boolean boolean15 = nativeArray9.isExtensible();
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, 4);
        java.lang.Object[] objArray18 = nativeArray9.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray29.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj32 = nativeArray24.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray29);
        boolean boolean33 = nativeArray24.hasPrototypeMap();
        java.lang.Object[] objArray34 = nativeArray24.getIds();
        int int35 = nativeArray24.size();
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int39 = nativeArray37.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray24.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray37);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeArray42.getParentScope();
        java.lang.Object[] objArray44 = nativeArray42.getIds();
        boolean boolean45 = nativeArray42.isEmpty();
        nativeArray9.put((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) boolean45);
        boolean boolean47 = nativeArray1.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray24);
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int52 = nativeArray50.lastIndexOf((java.lang.Object) (short) 10);
        long long53 = nativeArray50.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray50, "", true);
        boolean boolean57 = nativeArray50.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable61 = nativeArray60.getParentScope();
        java.lang.Object[] objArray62 = nativeArray60.getIds();
        boolean boolean63 = nativeArray60.isEmpty();
        boolean boolean64 = nativeArray50.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray60);
        java.lang.Object obj66 = nativeArray50.get((long) (byte) 0);
        boolean boolean67 = nativeArray1.has("object", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        java.lang.Object[] objArray68 = nativeArray50.getIds();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray50, "Array", true);
        com.google.javascript.rhino.head.Scriptable scriptable72 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator listIterator74 = nativeArray50.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[null]");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNull(scriptable72);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.Callable callable15 = null;
        nativeArray4.setGetterOrSetter("hi!", 0, callable15, false);
        java.lang.Integer[] intArray18 = nativeArray4.getIndexIds();
        com.google.javascript.rhino.head.Context context19 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray28.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray31, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj39 = nativeArray31.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray36);
        com.google.javascript.rhino.head.Callable callable42 = null;
        nativeArray31.setGetterOrSetter("hi!", 0, callable42, false);
        java.lang.Integer[] intArray45 = nativeArray31.getIndexIds();
        nativeArray24.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray31);
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int51 = nativeArray49.lastIndexOf((java.lang.Object) (short) 10);
        long long52 = nativeArray49.getLength();
        nativeArray49.delete((int) (byte) 1);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray49, "");
        nativeArray31.setAttributes("", (com.google.javascript.rhino.head.Scriptable) nativeArray49, 13);
        com.google.javascript.rhino.head.Scriptable scriptable59 = nativeArray49.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray49);
        java.lang.Object[] objArray61 = nativeArray49.toArray();
        nativeArray4.defineOwnProperties(context19, (com.google.javascript.rhino.head.ScriptableObject) nativeArray49);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray4, "");
        java.lang.Object[] objArray65 = nativeArray4.getIds();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(scriptable59);
        org.junit.Assert.assertNotNull(scriptable60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[null]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[hi!, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[hi!, ]");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.activatePrototypeMap((int) (short) 100);
        boolean boolean5 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!");
        boolean boolean6 = nativeArray1.isExtensible();
        java.lang.String str7 = nativeArray1.getTypeOf();
        com.google.javascript.rhino.head.Scriptable scriptable9 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object");
        boolean boolean10 = nativeArray1.isSealed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = nativeArray1.get((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "object" + "'", str7, "object");
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        java.lang.Integer[] intArray7 = nativeArray1.getIndexIds();
        java.lang.Object obj9 = null;
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", obj9);
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 8);
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray17, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int24 = nativeArray22.lastIndexOf((java.lang.Object) (short) 10);
        long long25 = nativeArray22.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray22, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray30.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray33, (java.lang.Object) (-1));
        java.lang.Object[] objArray36 = nativeArray30.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable37 = nativeArray30.getParentScope();
        boolean boolean38 = nativeArray22.containsAll((java.util.Collection) nativeArray30);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray40.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray43, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj51 = nativeArray43.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray48);
        boolean boolean52 = nativeArray43.hasPrototypeMap();
        java.lang.Object[] objArray53 = nativeArray43.getIds();
        java.lang.Object[] objArray54 = nativeArray30.toArray(objArray53);
        boolean boolean56 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, "Array");
        java.lang.Object obj57 = nativeArray17.get(2, (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        java.lang.Object obj58 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray1, (java.lang.Object) nativeArray17);
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable61 = nativeArray60.getParentScope();
        java.lang.Object[] objArray62 = nativeArray60.getIds();
        boolean boolean63 = nativeArray60.avoidObjectDetection();
        java.lang.Object obj67 = nativeArray60.getGetterOrSetter("", 0, true);
        boolean boolean68 = nativeArray60.avoidObjectDetection();
        com.google.javascript.rhino.head.NativeArray nativeArray70 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable71 = nativeArray70.getParentScope();
        java.lang.Object[] objArray72 = nativeArray70.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray74 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray77 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray74.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray77, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray82 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray82.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj85 = nativeArray77.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray82);
        java.lang.Object obj86 = nativeArray70.getAssociatedValue((java.lang.Object) nativeArray77);
        com.google.javascript.rhino.head.Scriptable scriptable87 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray70);
        nativeArray70.delete(2);
        int int90 = nativeArray70.size();
        java.lang.String str91 = nativeArray70.getClassName();
        java.lang.Object obj92 = nativeArray17.associateValue((java.lang.Object) nativeArray60, (java.lang.Object) nativeArray70);
        java.lang.String str93 = nativeArray70.getTypeOf();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[null]");
        org.junit.Assert.assertNull(scriptable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[null]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(scriptable61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(scriptable71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[length]");
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(scriptable87);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Array" + "'", str91, "Array");
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "object" + "'", str93, "object");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.activatePrototypeMap((int) (short) 100);
        boolean boolean27 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray23, "hi!");
        nativeArray4.setAttributes("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray23, 8);
        boolean boolean31 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray23, "");
        boolean boolean32 = nativeArray23.hasPrototypeMap();
        boolean boolean34 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray23, 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.activatePrototypeMap((int) (short) 100);
        com.google.javascript.rhino.head.Scriptable scriptable5 = com.google.javascript.rhino.head.ScriptableObject.getClassPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int10 = nativeArray8.lastIndexOf((java.lang.Object) (short) 10);
        long long11 = nativeArray8.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray8, "", true);
        boolean boolean15 = nativeArray8.hasPrototypeMap();
        int int16 = nativeArray8.size();
        boolean boolean17 = nativeArray8.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable18 = com.google.javascript.rhino.head.ScriptableObject.getTopLevelScope((com.google.javascript.rhino.head.Scriptable) nativeArray8);
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray8, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable22 = nativeArray8.getParentScope();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) (short) 10);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        nativeArray8.defineProperty("hi!", (java.lang.Object) nativeArray25, method26, method27, 0);
        nativeArray1.defineConst("", (com.google.javascript.rhino.head.Scriptable) nativeArray25);
        nativeArray1.delete((int) '4');
        org.junit.Assert.assertNull(scriptable5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(scriptable18);
        org.junit.Assert.assertNull(scriptable22);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.delete((-1));
        com.google.javascript.rhino.head.NativeArray nativeArray5 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray5.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray8, (java.lang.Object) (-1));
        java.lang.Object[] objArray11 = nativeArray5.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable12 = nativeArray5.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable13 = nativeArray5.getParentScope();
        boolean boolean14 = nativeArray5.isSealed();
        java.lang.Object obj16 = nativeArray5.get(0L);
        long long17 = nativeArray5.getLength();
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int22 = nativeArray20.lastIndexOf((java.lang.Object) (short) 10);
        long long23 = nativeArray20.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray20, "", true);
        boolean boolean27 = nativeArray20.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable31 = nativeArray30.getParentScope();
        java.lang.Object[] objArray32 = nativeArray30.getIds();
        boolean boolean33 = nativeArray30.isEmpty();
        boolean boolean34 = nativeArray20.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        boolean boolean36 = nativeArray30.isConst("object");
        java.lang.Object obj38 = nativeArray30.get((java.lang.Object) (byte) 10);
        nativeArray30.preventExtensions();
        boolean boolean40 = nativeArray5.has("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray30);
        int int41 = nativeArray1.lastIndexOf((java.lang.Object) nativeArray5);
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray44.activatePrototypeMap((int) (short) 100);
        boolean boolean47 = nativeArray5.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray44);
        com.google.javascript.rhino.head.Scriptable scriptable49 = null;
        java.lang.Object obj50 = nativeArray44.get("", scriptable49);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(scriptable12);
        org.junit.Assert.assertNull(scriptable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(scriptable31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeArray10.getParentScope();
        java.lang.Object[] objArray12 = nativeArray10.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", (java.lang.Object) nativeArray10, 0);
        nativeArray1.delete("Array");
        com.google.javascript.rhino.head.NativeArray nativeArray19 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray19.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray22, (java.lang.Object) (-1));
        java.lang.Object[] objArray25 = nativeArray19.getAllIds();
        java.lang.String str26 = nativeArray19.getTypeOf();
        int int27 = nativeArray19.size();
        boolean boolean29 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray19, "hi!");
        java.lang.Object obj31 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray19, 100);
        java.lang.Object obj32 = null;
        int int33 = nativeArray19.lastIndexOf(obj32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.IdFunctionObject idFunctionObject35 = nativeArray1.exportAsJSClass((int) (short) 0, (com.google.javascript.rhino.head.Scriptable) nativeArray19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[length]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "object" + "'", str26, "object");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj29 = nativeArray21.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray26);
        boolean boolean30 = nativeArray21.hasPrototypeMap();
        java.lang.Object[] objArray31 = nativeArray21.getIds();
        int int32 = nativeArray21.size();
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int36 = nativeArray34.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray21.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray34);
        java.lang.Object obj38 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray21);
        java.lang.Object[] objArray39 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray4);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int44 = nativeArray42.lastIndexOf((java.lang.Object) (short) 10);
        long long45 = nativeArray42.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray42, "", true);
        boolean boolean49 = nativeArray42.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) (-1));
        java.lang.Object[] objArray57 = nativeArray51.getAllIds();
        nativeArray51.delete("");
        boolean boolean60 = nativeArray42.contains((java.lang.Object) "");
        boolean boolean61 = nativeArray4.has("object", (com.google.javascript.rhino.head.Scriptable) nativeArray42);
        com.google.javascript.rhino.head.Context context62 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int66 = nativeArray64.lastIndexOf((java.lang.Object) (short) 10);
        long long67 = nativeArray64.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray64, "", true);
        boolean boolean71 = nativeArray64.hasPrototypeMap();
        boolean boolean72 = nativeArray64.isExtensible();
        nativeArray4.defineOwnProperties(context62, (com.google.javascript.rhino.head.ScriptableObject) nativeArray64);
        // The following exception was thrown during execution in test generation
        try {
            nativeArray4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[length]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        java.util.Iterator iterator16 = nativeArray4.iterator();
        com.google.javascript.rhino.head.Scriptable scriptable17 = nativeArray4.getParentScope();
        boolean boolean18 = nativeArray4.isSealed();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(scriptable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.activatePrototypeMap((int) (short) 100);
        com.google.javascript.rhino.head.Scriptable scriptable4 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 2);
        boolean boolean8 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (short) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray10.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray13, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj21 = nativeArray13.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray18);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int26 = nativeArray24.lastIndexOf((java.lang.Object) (short) 10);
        long long27 = nativeArray24.getLength();
        nativeArray24.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray18, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray36, (java.lang.Object) (-1));
        java.lang.Object[] objArray39 = nativeArray33.getAllIds();
        nativeArray33.delete("");
        java.lang.Object obj42 = nativeArray18.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray18, "hi!");
        com.google.javascript.rhino.head.Context context45 = null;
        com.google.javascript.rhino.head.Scriptable scriptable46 = null;
        java.lang.Object[] objArray47 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable46);
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray52 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray49.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray52, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray57.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj60 = nativeArray52.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray57);
        com.google.javascript.rhino.head.Callable callable63 = null;
        nativeArray52.setGetterOrSetter("hi!", 0, callable63, false);
        com.google.javascript.rhino.head.Scriptable scriptable66 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray52);
        nativeArray18.defineOwnProperty(context45, (java.lang.Object) scriptable46, (com.google.javascript.rhino.head.ScriptableObject) nativeArray52);
        boolean boolean68 = nativeArray18.avoidObjectDetection();
        java.lang.String str69 = nativeArray18.getClassName();
        nativeArray18.preventExtensions();
        com.google.javascript.rhino.head.NativeArray nativeArray73 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray76 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray73.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray76, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray81 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray81.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj84 = nativeArray76.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray81);
        boolean boolean85 = nativeArray76.hasPrototypeMap();
        java.lang.Object[] objArray86 = nativeArray76.getIds();
        int int87 = nativeArray76.size();
        java.util.Iterator iterator88 = nativeArray76.iterator();
        com.google.javascript.rhino.head.Scriptable scriptable89 = nativeArray76.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable90 = nativeArray76.getPrototype();
        java.lang.Object[] objArray91 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray76);
        java.lang.Object[] objArray92 = nativeArray76.getAllIds();
        java.lang.reflect.Method method93 = null;
        java.lang.reflect.Method method94 = null;
        nativeArray18.defineProperty("", (java.lang.Object) nativeArray76, method93, method94, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = nativeArray1.remove((java.lang.Object) method93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[length]");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(scriptable66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Array" + "'", str69, "Array");
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[hi!]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertNull(scriptable89);
        org.junit.Assert.assertNull(scriptable90);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[hi!]");
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[hi!, length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[hi!, length]");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        nativeArray1.delete("");
        java.lang.Object[] objArray10 = nativeArray1.getIds();
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray13.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray16, (java.lang.Object) (-1));
        java.lang.Object[] objArray19 = nativeArray13.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable20 = nativeArray13.getParentScope();
        com.google.javascript.rhino.head.Context context21 = null;
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        java.lang.Object[] objArray29 = nativeArray23.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable30 = nativeArray23.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable31 = nativeArray23.getParentScope();
        java.util.ListIterator listIterator32 = nativeArray23.listIterator();
        nativeArray13.defineOwnProperties(context21, (com.google.javascript.rhino.head.ScriptableObject) nativeArray23);
        long long34 = nativeArray23.jsGet_length();
        boolean boolean35 = nativeArray23.isEmpty();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!", (java.lang.Object) nativeArray23, 8);
        boolean boolean38 = nativeArray23.isSealed();
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int43 = nativeArray41.lastIndexOf((java.lang.Object) (short) 10);
        long long44 = nativeArray41.getLength();
        nativeArray41.delete((int) (byte) 1);
        boolean boolean47 = nativeArray41.isExtensible();
        java.lang.Object obj49 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray41, 4);
        java.lang.Object[] objArray50 = nativeArray41.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray53 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray53.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray56, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray61 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray61.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj64 = nativeArray56.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray61);
        boolean boolean65 = nativeArray56.hasPrototypeMap();
        java.lang.Object[] objArray66 = nativeArray56.getIds();
        int int67 = nativeArray56.size();
        com.google.javascript.rhino.head.NativeArray nativeArray69 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int71 = nativeArray69.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray56.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray69);
        com.google.javascript.rhino.head.NativeArray nativeArray74 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable75 = nativeArray74.getParentScope();
        java.lang.Object[] objArray76 = nativeArray74.getIds();
        boolean boolean77 = nativeArray74.isEmpty();
        nativeArray41.put((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray56, (java.lang.Object) boolean77);
        java.lang.Object[] objArray79 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray41);
        // The following exception was thrown during execution in test generation
        try {
            nativeArray23.add((int) (byte) 0, (java.lang.Object) nativeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null]");
        org.junit.Assert.assertNull(scriptable20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertNull(scriptable31);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[null]");
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[hi!]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(scriptable75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray8.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray11, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray16.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj19 = nativeArray11.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Callable callable22 = null;
        nativeArray11.setGetterOrSetter("hi!", 0, callable22, false);
        java.lang.Integer[] intArray25 = nativeArray11.getIndexIds();
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray11);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int30 = nativeArray28.lastIndexOf((java.lang.Object) (short) 10);
        long long31 = nativeArray28.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray28, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray39 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray39, (java.lang.Object) (-1));
        java.lang.Object[] objArray42 = nativeArray36.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeArray36.getParentScope();
        boolean boolean44 = nativeArray28.containsAll((java.util.Collection) nativeArray36);
        nativeArray36.delete("Array");
        java.lang.Object obj47 = nativeArray4.getAssociatedValue((java.lang.Object) nativeArray36);
        nativeArray36.activatePrototypeMap(13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator listIterator51 = nativeArray36.listIterator(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[null]");
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        nativeArray1.defineProperty("hi!", (java.lang.Object) (-1L), method11, method12, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        com.google.javascript.rhino.head.Scriptable scriptable17 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        java.lang.Object[] objArray18 = nativeArray1.getIds();
        java.lang.Object[] objArray19 = nativeArray1.toArray();
        java.lang.Object[] objArray20 = nativeArray1.toArray();
        java.lang.Object[] objArray21 = nativeArray1.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(scriptable17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable7 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int11 = nativeArray9.lastIndexOf((java.lang.Object) (short) 10);
        long long12 = nativeArray9.getLength();
        nativeArray9.delete((int) (byte) 1);
        boolean boolean15 = nativeArray9.isExtensible();
        java.lang.Object obj17 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, 4);
        java.lang.Object[] objArray18 = nativeArray9.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray21.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray29.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj32 = nativeArray24.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray29);
        boolean boolean33 = nativeArray24.hasPrototypeMap();
        java.lang.Object[] objArray34 = nativeArray24.getIds();
        int int35 = nativeArray24.size();
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int39 = nativeArray37.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray24.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray37);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable43 = nativeArray42.getParentScope();
        java.lang.Object[] objArray44 = nativeArray42.getIds();
        boolean boolean45 = nativeArray42.isEmpty();
        nativeArray9.put((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray24, (java.lang.Object) boolean45);
        boolean boolean47 = nativeArray1.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray24);
        nativeArray24.setAttributes("hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray53 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray53.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray56, (java.lang.Object) (-1));
        java.lang.Object[] objArray59 = nativeArray53.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray60 = new com.google.javascript.rhino.head.NativeArray(objArray59);
        com.google.javascript.rhino.head.NativeArray nativeArray62 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        java.lang.Object obj64 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray62, "Array");
        com.google.javascript.rhino.head.Scriptable scriptable65 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray62);
        nativeArray60.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray62);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = nativeArray24.getAttributes((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) nativeArray60);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: Property 100 not found.");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scriptable7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[null]");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(scriptable43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[null]");
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNull(scriptable65);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable8 = nativeArray1.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable9 = nativeArray1.getParentScope();
        boolean boolean10 = nativeArray1.isSealed();
        com.google.javascript.rhino.head.Scriptable scriptable11 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        com.google.javascript.rhino.head.NativeArray nativeArray16 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray16, "", (java.lang.Object) 100);
        java.lang.Object obj20 = nativeArray13.associateValue((java.lang.Object) ' ', (java.lang.Object) nativeArray16);
        java.lang.Object[] objArray21 = nativeArray16.toArray();
        boolean boolean23 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray16, "");
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray29, (java.lang.Object) (-1));
        boolean boolean33 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray29, "");
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int38 = nativeArray36.lastIndexOf((java.lang.Object) (short) 10);
        long long39 = nativeArray36.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray36, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray44.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray47, (java.lang.Object) (-1));
        java.lang.Object[] objArray50 = nativeArray44.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable51 = nativeArray44.getParentScope();
        boolean boolean52 = nativeArray36.containsAll((java.util.Collection) nativeArray44);
        com.google.javascript.rhino.head.Scriptable scriptable53 = nativeArray44.getParentScope();
        boolean boolean54 = nativeArray44.isEmpty();
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable58 = nativeArray57.getParentScope();
        java.lang.Object[] objArray59 = nativeArray57.getIds();
        boolean boolean60 = nativeArray44.has("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray57);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        nativeArray29.defineProperty("hi!", (java.lang.Object) nativeArray44, method61, method62, 8);
        nativeArray16.defineConst("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray44);
        java.lang.Object[] objArray66 = nativeArray16.getIds();
        nativeArray1.setPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray16);
        com.google.javascript.rhino.head.Scriptable scriptable68 = nativeArray1.getParentScope();
        boolean boolean70 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNull(scriptable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[null]");
        org.junit.Assert.assertNull(scriptable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(scriptable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(scriptable58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNull(scriptable68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable2 = nativeArray1.getParentScope();
        java.lang.Object[] objArray3 = nativeArray1.getIds();
        boolean boolean4 = nativeArray1.avoidObjectDetection();
        java.lang.Object obj8 = nativeArray1.getGetterOrSetter("", 0, true);
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int12 = nativeArray10.lastIndexOf((java.lang.Object) (short) 10);
        long long13 = nativeArray10.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray10, "", true);
        boolean boolean17 = nativeArray10.hasPrototypeMap();
        com.google.javascript.rhino.head.Scriptable scriptable19 = null;
        java.lang.Object obj20 = nativeArray10.get((int) '#', scriptable19);
        nativeArray10.preventExtensions();
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int26 = nativeArray24.lastIndexOf((java.lang.Object) (short) 10);
        long long27 = nativeArray24.getLength();
        java.lang.Object[] objArray28 = nativeArray24.toArray();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        nativeArray10.defineProperty("Array", (java.lang.Object) nativeArray24, method29, method30, 13);
        java.lang.Object obj34 = null;
        com.google.javascript.rhino.head.ScriptableObject.putProperty((com.google.javascript.rhino.head.Scriptable) nativeArray24, "hi!", obj34);
        java.lang.Object obj36 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray1, (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(scriptable2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[null]");
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeArray10.getParentScope();
        java.lang.Object[] objArray12 = nativeArray10.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", (java.lang.Object) nativeArray10, 0);
        nativeArray1.setAttributes("hi!", 10);
        boolean boolean18 = nativeArray1.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int23 = nativeArray21.lastIndexOf((java.lang.Object) (short) 10);
        long long24 = nativeArray21.getLength();
        nativeArray21.delete((int) (byte) 1);
        boolean boolean27 = nativeArray21.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable31 = nativeArray30.getParentScope();
        java.lang.Object[] objArray32 = nativeArray30.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray21, "", (java.lang.Object) nativeArray30, 0);
        java.lang.Object[] objArray35 = nativeArray21.toArray();
        nativeArray21.preventExtensions();
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", (java.lang.Object) nativeArray21);
        nativeArray21.setAttributes("object", (int) (short) 0);
        com.google.javascript.rhino.head.NativeArray nativeArray42 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray42.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray45, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray50.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj53 = nativeArray45.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray50);
        com.google.javascript.rhino.head.Callable callable56 = null;
        nativeArray45.setGetterOrSetter("hi!", 0, callable56, false);
        java.lang.Integer[] intArray59 = nativeArray45.getIndexIds();
        java.lang.Object[] objArray60 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds((com.google.javascript.rhino.head.Scriptable) nativeArray45);
        java.lang.Object[] objArray61 = nativeArray21.toArray(objArray60);
        com.google.javascript.rhino.head.NativeArray nativeArray62 = new com.google.javascript.rhino.head.NativeArray(objArray61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(scriptable11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(scriptable31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[null]");
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[null]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[null]");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable8 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        java.lang.Object[] objArray9 = nativeArray1.getAllIds();
        java.util.ListIterator listIterator10 = nativeArray1.listIterator();
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int14 = nativeArray12.lastIndexOf((java.lang.Object) (short) 10);
        long long15 = nativeArray12.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray12, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable19 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        nativeArray12.activatePrototypeMap(100);
        int int22 = nativeArray1.lastIndexOf((java.lang.Object) nativeArray12);
        nativeArray1.sealObject();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNull(scriptable8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[length]");
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNull(scriptable19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        nativeArray15.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        java.lang.Object[] objArray30 = nativeArray24.getAllIds();
        nativeArray24.delete("");
        java.lang.Object obj33 = nativeArray9.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray24);
        com.google.javascript.rhino.head.ScriptableObject.defineConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        com.google.javascript.rhino.head.Context context36 = null;
        com.google.javascript.rhino.head.Scriptable scriptable37 = null;
        java.lang.Object[] objArray38 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable37);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray40.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray43, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj51 = nativeArray43.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray48);
        com.google.javascript.rhino.head.Callable callable54 = null;
        nativeArray43.setGetterOrSetter("hi!", 0, callable54, false);
        com.google.javascript.rhino.head.Scriptable scriptable57 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray43);
        nativeArray9.defineOwnProperty(context36, (java.lang.Object) scriptable37, (com.google.javascript.rhino.head.ScriptableObject) nativeArray43);
        long long59 = nativeArray9.getLength();
        boolean boolean61 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        boolean boolean62 = nativeArray9.isEmpty();
        com.google.javascript.rhino.head.Scriptable scriptable63 = com.google.javascript.rhino.head.ScriptableObject.getObjectPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[length]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(scriptable57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(scriptable63);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray7 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray4.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray7, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj15 = nativeArray7.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.Callable callable18 = null;
        nativeArray7.setGetterOrSetter("hi!", 0, callable18, false);
        nativeArray1.setAttributes((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray7, (int) (short) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray24 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray24.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray27, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray32.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj35 = nativeArray27.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray32);
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int40 = nativeArray38.lastIndexOf((java.lang.Object) (short) 10);
        long long41 = nativeArray38.getLength();
        nativeArray38.delete((int) (byte) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray32, "hi!", (java.lang.Object) (byte) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray47 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray50 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray47.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray50, (java.lang.Object) (-1));
        java.lang.Object[] objArray53 = nativeArray47.getAllIds();
        nativeArray47.delete("");
        java.lang.Object obj56 = nativeArray32.get(10, (com.google.javascript.rhino.head.Scriptable) nativeArray47);
        java.lang.Integer[] intArray57 = nativeArray47.getIndexIds();
        java.lang.Object obj58 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue((com.google.javascript.rhino.head.Scriptable) nativeArray1, (java.lang.Object) intArray57);
        boolean boolean60 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "hi!");
        boolean boolean62 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[length]");
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable8 = null;
        java.lang.Object[] objArray9 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable8);
        java.lang.Object[] objArray10 = nativeArray1.toArray(objArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int15 = nativeArray13.lastIndexOf((java.lang.Object) (short) 10);
        long long16 = nativeArray13.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "", true);
        boolean boolean20 = nativeArray13.hasPrototypeMap();
        int int21 = nativeArray13.size();
        boolean boolean22 = nativeArray13.isEmpty();
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "Array");
        java.lang.Object obj25 = nativeArray1.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray13);
        nativeArray13.setAttributes("object", (int) (byte) 0);
        nativeArray13.preventExtensions();
        com.google.javascript.rhino.head.Scriptable scriptable31 = null;
        boolean boolean32 = nativeArray13.has("", scriptable31);
        java.lang.String str33 = nativeArray13.getTypeOf();
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int38 = nativeArray36.lastIndexOf((java.lang.Object) (short) 10);
        long long39 = nativeArray36.getLength();
        nativeArray36.delete((int) (byte) 1);
        boolean boolean42 = nativeArray36.isExtensible();
        java.lang.Object obj44 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray36, 4);
        java.lang.Object[] objArray45 = nativeArray36.toArray();
        nativeArray36.delete((int) (short) 0);
        java.lang.Object obj48 = nativeArray13.get(0, (com.google.javascript.rhino.head.Scriptable) nativeArray36);
        nativeArray36.setAttributes("hi!", 13);
        com.google.javascript.rhino.head.Scriptable scriptable52 = nativeArray36.getParentScope();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "object" + "'", str33, "object");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[null]");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(scriptable52);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.Scriptable scriptable8 = null;
        java.lang.Object[] objArray9 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable8);
        java.lang.Object[] objArray10 = nativeArray1.toArray(objArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int15 = nativeArray13.lastIndexOf((java.lang.Object) (short) 10);
        long long16 = nativeArray13.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "", true);
        boolean boolean20 = nativeArray13.hasPrototypeMap();
        int int21 = nativeArray13.size();
        boolean boolean22 = nativeArray13.isEmpty();
        boolean boolean24 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, "Array");
        java.lang.Object obj25 = nativeArray1.get("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray13);
        com.google.javascript.rhino.head.Scriptable scriptable26 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray29 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray29.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray32, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray37.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj40 = nativeArray32.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray37);
        boolean boolean41 = nativeArray32.hasPrototypeMap();
        java.lang.Object[] objArray42 = nativeArray32.getIds();
        int int43 = nativeArray32.size();
        com.google.javascript.rhino.head.NativeArray nativeArray45 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int47 = nativeArray45.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray32.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray45);
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.activatePrototypeMap((int) (short) 100);
        boolean boolean55 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray51, "hi!");
        nativeArray32.setAttributes("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray51, 8);
        nativeArray1.setAttributes("Array", (com.google.javascript.rhino.head.Scriptable) nativeArray32, 0);
        com.google.javascript.rhino.head.Scriptable scriptable60 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray32);
        com.google.javascript.rhino.head.NativeArray nativeArray63 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray63.activatePrototypeMap((int) (short) 100);
        java.util.Iterator iterator66 = nativeArray63.iterator();
        nativeArray32.defineProperty("object", (java.lang.Object) nativeArray63, (int) (short) 0);
        boolean boolean69 = nativeArray32.isSealed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(scriptable26);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[hi!]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(scriptable60);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        int int9 = nativeArray1.size();
        boolean boolean10 = nativeArray1.isEmpty();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array");
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int17 = nativeArray15.lastIndexOf((java.lang.Object) (short) 10);
        long long18 = nativeArray15.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray26, (java.lang.Object) (-1));
        java.lang.Object[] objArray29 = nativeArray23.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable30 = nativeArray23.getParentScope();
        boolean boolean31 = nativeArray15.containsAll((java.util.Collection) nativeArray23);
        boolean boolean33 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "object");
        nativeArray1.put(100, (com.google.javascript.rhino.head.Scriptable) nativeArray15, (java.lang.Object) ' ');
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", true);
        com.google.javascript.rhino.head.Scriptable scriptable39 = nativeArray1.getParentScope();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNull(scriptable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(scriptable39);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        java.lang.String str8 = nativeArray1.getTypeOf();
        nativeArray1.delete("hi!");
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray12.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray15, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable18 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray12);
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int22 = nativeArray20.lastIndexOf((java.lang.Object) (short) 10);
        long long23 = nativeArray20.getLength();
        nativeArray20.delete((int) (byte) 1);
        boolean boolean26 = nativeArray20.isExtensible();
        java.lang.Object obj28 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray20, 4);
        java.lang.Object[] objArray29 = nativeArray20.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray32 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray35 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray32.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray35, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray40.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj43 = nativeArray35.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray40);
        boolean boolean44 = nativeArray35.hasPrototypeMap();
        java.lang.Object[] objArray45 = nativeArray35.getIds();
        int int46 = nativeArray35.size();
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int50 = nativeArray48.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray35.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray48);
        com.google.javascript.rhino.head.NativeArray nativeArray53 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable54 = nativeArray53.getParentScope();
        java.lang.Object[] objArray55 = nativeArray53.getIds();
        boolean boolean56 = nativeArray53.isEmpty();
        nativeArray20.put((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray35, (java.lang.Object) boolean56);
        boolean boolean58 = nativeArray12.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray35);
        java.lang.Object obj60 = nativeArray1.associateValue((java.lang.Object) boolean58, (java.lang.Object) ' ');
        com.google.javascript.rhino.head.NativeArray nativeArray62 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray62.activatePrototypeMap((int) (short) 100);
        java.util.Iterator iterator65 = nativeArray62.iterator();
        boolean boolean66 = nativeArray62.hasPrototypeMap();
        boolean boolean68 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray62, "");
        int int69 = nativeArray1.indexOf((java.lang.Object) "");
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "object", false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "object" + "'", str8, "object");
        org.junit.Assert.assertNull(scriptable18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[hi!]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(scriptable54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + ' ' + "'", obj60, ' ');
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        java.lang.Object[] objArray15 = nativeArray9.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable16 = nativeArray9.getParentScope();
        boolean boolean17 = nativeArray1.containsAll((java.util.Collection) nativeArray9);
        com.google.javascript.rhino.head.NativeArray nativeArray19 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray19.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray22, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray27.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj30 = nativeArray22.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray27);
        boolean boolean31 = nativeArray22.hasPrototypeMap();
        java.lang.Object[] objArray32 = nativeArray22.getIds();
        java.lang.Object[] objArray33 = nativeArray9.toArray(objArray32);
        com.google.javascript.rhino.head.NativeArray nativeArray34 = new com.google.javascript.rhino.head.NativeArray(objArray32);
        boolean boolean36 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray34, (-1));
        boolean boolean37 = nativeArray34.isExtensible();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNull(scriptable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[null]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[null]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        nativeArray1.delete("");
        long long10 = nativeArray1.getLength();
        boolean boolean12 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, (int) (short) 10);
        nativeArray1.delete(2);
        com.google.javascript.rhino.head.Scriptable scriptable15 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list18 = nativeArray1.subList(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[length]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[length]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(scriptable15);
    }
}

