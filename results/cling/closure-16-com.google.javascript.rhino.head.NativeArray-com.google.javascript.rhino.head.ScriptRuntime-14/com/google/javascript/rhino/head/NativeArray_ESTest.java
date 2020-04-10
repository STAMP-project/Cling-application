/*

 * Tue Mar 03 20:30:23 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeArray0.get((-115), (Scriptable) nativeIterator_StopIteration0);
      nativeIterator_StopIteration0.put("-1", (Scriptable) nativeArray0, object0);
      assertEquals(5L, nativeArray0.getLength());
      assertEquals(5L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      int int0 = nativeArray0.findPrototypeId("z 9o`-l~|5");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1789569706L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(4);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 4 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(13);
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "", (Object) context0, 140);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 140
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(261L);
      NativeString nativeString0 = new NativeString("K");
      nativeArray0.put("K", (Scriptable) nativeString0, (Object) "K");
      assertEquals(261L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.sealObject();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put((-1123), (Scriptable) nativeArray0, (Object) nativeArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: -1123.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(711L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-2147268920));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -2147268920 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10L);
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaPackage
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(1920);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 1920 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(13L);
      nativeArray0.has((-57), (Scriptable) nativeArray0);
      assertEquals(13L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, 8);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-454L));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, true);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1509L));
      nativeArray0.delete((-1155));
      assertEquals((-1509L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      Delegator delegator0 = new Delegator(nativeArray0);
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeArray0, delegator0, nativeIterator_StopIteration0, objectArray0);
      nativeIterator_StopIteration0.put(" : ", (Scriptable) nativeArray0, (Object) boundFunction0);
      assertEquals(2L, nativeArray0.getLength());
      assertEquals(2L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.findPrototypeId("java.lang.Float");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(4);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(6);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 6 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.getIndexIds();
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, 1);
      assertTrue(boolean0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter");
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeJavaPackage0, 1324, "error reporter", 5, nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1324 MASTER=com.google.javascript.rhino.head.NativeArray@37f80351
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483648L);
      Context context0 = Context.getCurrentContext();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeGenerator0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(4503599627370495L);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context0, scriptable0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put("0e-aYu9=4+J=N=s#", (Scriptable) nativeArray0, (Object) "0e-aYu9=4+J=N=s#");
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "s&DwW.<M(NZ,E");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(1, (Scriptable) nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray nativeArray1 = new NativeArray(1789569706L);
      nativeArray1.has(1, (Scriptable) nativeArray0);
      assertEquals(1789569706L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeCall nativeCall0 = new NativeCall();
      long long0 = NativeArray.getLengthProperty(context0, nativeCall0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(2);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Double double0 = new Double(41.0);
      NativeArray nativeArray0 = new NativeArray((-531L));
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor((Context) null, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.setInstanceIdValue(1, (Object) null);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      BaseFunction baseFunction0 = new BaseFunction();
      nativeIterator_StopIteration0.put(8, (Scriptable) nativeArray0, (Object) baseFunction0);
      assertEquals(9L, nativeArray0.jsGet_length());
      assertEquals(9L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2859L));
      NativeArray nativeArray1 = new NativeArray(13);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(1, (Scriptable) nativeArray1, (Object) nativeArray0);
      assertTrue(nativeArray1.isEmpty());
      assertEquals(13L, nativeArray1.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put("0", (Scriptable) nativeArray0, (Object) null);
      assertEquals(1L, nativeArray0.getLength());
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(6);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(10, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(11L, nativeArray0.jsGet_length());
      assertEquals(11L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeString nativeString0 = new NativeString("language version");
      long long0 = NativeArray.getLengthProperty(context0, nativeString0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      long long0 = NativeArray.getLengthProperty(context0, nativeArray0);
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      int int0 = nativeArray0.findPrototypeId("<33Y[@(d.");
      assertEquals(0, int0);
      assertEquals(2147483647L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(5, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(10000);
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(128, nativeArray0, false);
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
      assertEquals(0L, nativeArray1.jsGet_length());
      assertEquals(10000L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      nativeArray0.put(5, (Scriptable) importerTopLevel0, (Object) importerTopLevel0);
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      Comparator<BaseFunction> comparator0 = (Comparator<BaseFunction>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.sort(comparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1848L));
      nativeArray0.get(4052, (Scriptable) null);
      assertEquals((-1848L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put((-1123), (Scriptable) nativeArray0, (Object) nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
      assertEquals(1431L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2984L));
      int int0 = nativeArray0.findPrototypeId("N{b!([nwRh.)");
      assertEquals(0, int0);
      assertEquals((-2984L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1);
      Class<Double> class0 = Double.class;
      nativeArray0.defineProperty("-)rpEQ1", class0, 8);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(2020, nativeArray0, false);
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, objectArray0);
      assertEquals(5L, nativeArray0.getLength());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(15, (Scriptable) nativeArray0, (Object) nativeIterator_StopIteration0);
      assertFalse(nativeArray0.isEmpty());
      assertEquals(16L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.activatePrototypeMap(8232);
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
  public void test49()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(100);
      nativeArray0.delete(74);
      assertEquals(100L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1064L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Byte byte0 = new Byte((byte)12);
      nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertEquals(1064L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version");
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeJavaPackage0, true);
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
  public void test52()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      Float float0 = new Float((-1.0F));
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("language version", classLoader0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) float0, (ScriptableObject) nativeJavaPackage0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
