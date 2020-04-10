/*

 * Tue Mar 03 20:32:03 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
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
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object[] objectArray0 = importerTopLevel0.getIds(true);
      assertEquals(59, objectArray0.length);
      
      Object object0 = ScriptableObject.callMethod((Scriptable) importerTopLevel0, "uneval", objectArray0);
      assertEquals("\"Function\"", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = nativeArray0.get((-745), (Scriptable) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9221120237041090546L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1913391558));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1913391558 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(110);
      nativeArray0.defineOwnProperty(context0, (Object) "", (ScriptableObject) nativeCall0, true);
      assertEquals(110L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2836L));
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1209));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -1209 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(13, (Scriptable) nativeArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(2).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(context0).hasFeature(anyInt());
      Object object0 = nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, objectArray0);
      assertNotNull(object0);
      assertEquals(7L, nativeArray0.jsGet_length());
      assertEquals(",,,,,,", object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7054365918152680535L));
      Context context0 = Context.getContext();
      Byte byte0 = new Byte((byte) (-100));
      nativeArray0.defineOwnProperty(context0, (Object) byte0, (ScriptableObject) nativeArray0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(13).when(idFunctionObject0).methodId();
      doReturn((Object) null).when(idFunctionObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(idFunctionObject0).getParentScope();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, objectArray0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // \"Array\" is not a constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete((-3352));
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1332L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(180);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 180 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "+:b", (Object) null, (-2906));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2906
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-248L));
      nativeArray0.findPrototypeId("StopIteration");
      assertEquals((-248L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      boolean boolean0 = nativeWith0.has(4, (Scriptable) nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      boolean boolean0 = nativeArray0.has(9, (Scriptable) null);
      assertFalse(boolean0);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(2);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 0, 0);
      Context context0 = Context.getContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, nativeCall0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=0 MASTER=com.google.javascript.rhino.head.NativeArray@765a568a
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4890909195324358655L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, synchronizer0);
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
  public void test22()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeArray0.defineProperty("no message resource found for message property ", (Object) nativeJavaClass0, 10);
      assertEquals(3L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor((Context) null, (Object) null);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1982292598L);
      Delegator delegator0 = new Delegator();
      nativeArray0.has((-1394), (Scriptable) delegator0);
      assertEquals(1982292598L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      ScriptableObject.defineProperty((Scriptable) nativeWith0, "Infinity", (Object) nativeWith0, 23);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(7, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      Context context0 = Context.enter();
      long long0 = NativeArray.getLengthProperty(context0, nativeWith0);
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(2225);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = new Integer(3689);
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, integer0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeWith nativeWith0 = new NativeWith(nativeArray0, nativeArray0);
      BaseFunction baseFunction0 = new BaseFunction();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(baseFunction0, false);
      Byte byte0 = new Byte((byte)38);
      nativeGenerator0.put(0, (Scriptable) nativeWith0, (Object) byte0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(7L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      nativeArray0.indexOf(nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Scriptable scriptable0 = Context.toObject((Object) "language version", (Scriptable) importerTopLevel0);
      long long0 = NativeArray.getLengthProperty(context0, scriptable0);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.enter();
      nativeArray0.defineProperty("--", (Object) context0.VERSION_UNKNOWN, 13);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(7, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      assertEquals(8L, nativeArray0.getLength());
      
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(2).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(25).when(context0).getLanguageVersion();
      doReturn(true).when(context0).hasFeature(anyInt());
      Object object0 = nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, objectArray0);
      assertNotNull(object0);
      assertEquals("[, , , , , , , , ]", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1, nativeArray0, false);
      nativeArray0.put(160, (Scriptable) idFunctionObject0, (Object) null);
      assertEquals("Array", idFunctionObject0.getFunctionName());
      assertEquals(10L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeCall nativeCall0 = context0.currentActivationCall;
      // Undeclared exception!
      try { 
        Context.toObject((Object) context0, (Scriptable) nativeCall0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(7);
      nativeArray0.get(11, (Scriptable) nativeCall0);
      assertEquals(7L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = new Object[11];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, (-2839), (Object) nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(11, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1, nativeArray0, false);
      assertFalse(nativeArray0.isEmpty());
      
      nativeArray0.checkPropertyChange("IW2Wb_K(PuT", idFunctionObject0, nativeArray0);
      assertEquals(10L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn((-606)).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, integerArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -606
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      Object[] objectArray0 = Context.emptyArgs;
      BaseFunction baseFunction0 = new BaseFunction();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test44()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArray nativeArray0 = new NativeArray(160);
      nativeArray0.exportAsJSClass(93, importerTopLevel0, false);
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
  public void test45()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(687L);
      nativeArray0.delete(53);
      assertEquals(687L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483642L);
      nativeArray0.delete(358);
      assertEquals(2147483642L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(3L);
      Double double0 = new Double(5);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = new Context();
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeCall0, (ScriptableObject) nativeCall0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeArray.setMaximumInitialCapacity(2);
      NativeArray nativeArray0 = new NativeArray((-528786136287117932L));
      NativeArray nativeArray1 = new NativeArray(2441L);
      // Undeclared exception!
      try { 
        nativeArray1.defineOwnProperty(context0, (Object) importerTopLevel0, (ScriptableObject) nativeArray0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-156L));
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "2", (Object) nativeArray0, 121);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 121
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Object[] objectArray0 = new Object[16];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(110, nativeArray0, false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      nativeArray0.execIdCall(idFunctionObject0, context0, nativeArray0, idFunctionObject0, objectArray0);
      assertFalse(nativeArray0.isEmpty());
  }
}
