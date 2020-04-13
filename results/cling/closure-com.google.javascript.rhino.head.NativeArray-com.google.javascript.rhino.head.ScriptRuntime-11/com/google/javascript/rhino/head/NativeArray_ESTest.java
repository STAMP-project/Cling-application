/*

 * Tue Mar 03 20:29:33 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionCall;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(24L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeArray0.get((-14), (Scriptable) importerTopLevel0);
      assertEquals("Array", nativeArray0.getClassName());
      assertEquals(24L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(110);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 110 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject.putConstProperty(nativeArray0, "", nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1730L);
      NativeNumber nativeNumber0 = new NativeNumber(24.0);
      nativeArray0.put("sCkSKyH+m", (Scriptable) nativeNumber0, (Object) "sCkSKyH+m");
      assertEquals(1730L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(6L);
      nativeArray0.sealObject();
      // Undeclared exception!
      try { 
        ScriptableObject.putProperty((Scriptable) nativeArray0, (-3339), (Object) nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: -3339.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-763));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -763 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      Context context0 = Context.getContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeJavaTopPackage0, (ScriptableObject) nativeJavaTopPackage0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(100);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 100 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-60L));
      Delegator delegator0 = new Delegator(nativeArray0);
      nativeArray0.has(2076, (Scriptable) delegator0);
      assertEquals((-60L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 13, "+oQ-'?vyFBY", 0, nativeArray0);
      Context context0 = Context.getCurrentContext();
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) idFunctionObject0, false);
      assertEquals(7L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-544L));
      nativeArray0.delete((-1950));
      assertEquals((-544L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("language version");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(5);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-789L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 2 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      Object object0 = nativeArray0.get(1179);
      assertNull(object0);
      assertEquals(1431655764L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("StopIteration");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(30L);
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray1.has(0, (Scriptable) nativeArray0);
      assertTrue(boolean0);
      assertEquals(30L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject((IdFunctionCall) null, nativeArray0, 160, 9);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=160 MASTER=null
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.getOwnPropertyDescriptor(context0, importerTopLevel0);
      assertEquals("Array", nativeArray0.getClassName());
      assertEquals(2147483647L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        Context.toNumber(nativeArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putConstProperty(nativeArray0, " >> ", nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(7, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "knR");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray1 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(8, nativeArray0, true);
      NativeError nativeError0 = NativeError.make(context0, nativeArray1, idFunctionObject0, objectArray0);
      NativeArray.getLengthProperty(context0, nativeError0);
      assertEquals(6L, nativeArray0.getLength());
      assertEquals(6L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000L);
      nativeArray0.delete(43);
      assertEquals(10000L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(150);
      Long long0 = new Long(4096L);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, long0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1933L);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.setInstanceIdValue(1, (Object) null);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) scriptableObject0, (Class<?>) class0);
      NativeArray nativeArray0 = new NativeArray(5);
      scriptableObject0.put(8, (Scriptable) nativeArray0, (Object) scriptable0);
      assertEquals(9L, nativeArray0.getLength());
      assertEquals(9L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(24L);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 0, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(24L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putConstProperty(nativeArray0, "-1", nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(5, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeString nativeString0 = new NativeString((CharSequence) null);
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context0, nativeString0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeString", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      Context context0 = new Context();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("!P bFP0%e", classLoader0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("", importerTopLevel0);
      Scriptable scriptable0 = JavaAdapter.createAdapterWrapper(nativeJavaPackage1, "");
      Scriptable scriptable1 = context0.newArray(scriptable0, 0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(scriptable1, "!P bFP0%e", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: !P bFP0%e is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.exportAsJSClass(4, importerTopLevel0, true);
      Class<Integer> class0 = Integer.class;
      Object object0 = nativeArray0.getDefaultValue(class0);
      assertEquals(",,,,", object0);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1931L);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(10, (Scriptable) null, false);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, context0.emptyArgs);
      assertEquals(1931L, nativeArray0.getLength());
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals("Array", nativeArray1.getClassName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeArray nativeArray1 = (NativeArray)context0.newArray((Scriptable) nativeArray0, 1);
      nativeArray0.put(12, (Scriptable) nativeArray1, (Object) nativeArray1);
      assertEquals(13L, nativeArray1.jsGet_length());
      assertTrue(nativeArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Long long0 = new Long(4);
      nativeArray0.put(216, (Scriptable) nativeArray0, (Object) long0);
      boolean boolean0 = nativeArray0.contains(long0);
      assertFalse(nativeArray0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      NativeCall nativeCall0 = context0.currentActivationCall;
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-5685), (Object) nativeCall0);
      assertFalse(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(110, (Scriptable) null, false);
      NativeError nativeError0 = NativeError.make(context0, nativeArray0, idFunctionObject0, context0.emptyArgs);
      assertFalse(nativeArray0.isEmpty());
      
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeError0, "'cN [bv9Yw\"!", class0);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(1931L);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(10, (Scriptable) null, false);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) idFunctionObject0, "reduceRight", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7187745005283311616L));
      Context context0 = new Context();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeArray0);
      nativeArray0.put(2587, scriptable0, (Object) nativeArray0.READONLY);
      assertEquals(2588L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.activatePrototypeMap(33);
      // Undeclared exception!
      try { 
        nativeArray0.getIndexIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 24
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Context context0 = new Context();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.delete(5);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.delete(8);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeArray nativeArray0 = new NativeArray(120);
      nativeArray0.defineOwnProperty(context0, (Object) scriptableObject0, scriptableObject0, false);
      nativeArray0.has(6, (Scriptable) scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.defineOwnProperty(context0, (Object) null, importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Short short0 = new Short((short)2);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor((Context) null, short0);
      assertEquals("object", scriptableObject0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      ScriptableObject.putConstProperty(nativeArray0, "0/\"D=C( |XUoWVNZ_", nativeWith0);
      nativeArray0.getIndexIds();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray1 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(8, nativeArray0, true);
      NativeArray nativeArray2 = (NativeArray)contextFactory0.doTopCall(idFunctionObject0, context0, idFunctionObject0, nativeArray1, objectArray0);
      assertEquals(6L, nativeArray2.jsGet_length());
  }
}
