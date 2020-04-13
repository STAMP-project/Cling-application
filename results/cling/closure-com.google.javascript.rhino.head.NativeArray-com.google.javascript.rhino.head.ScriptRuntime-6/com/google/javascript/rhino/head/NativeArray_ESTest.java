/*

 * Tue Mar 03 20:27:20 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(11);
      nativeArray0.get((-1105), (Scriptable) nativeArray0);
      assertEquals(11L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(711L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(711L);
      NativeArray.init(nativeArray0, true);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(idFunctionObject0).getPrototype();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(13).when(idFunctionObject0).methodId();
      doReturn(nativeArray0).when(idFunctionObject0).getParentScope();
      doReturn("+lI<`LdpNdZvetS").when(idFunctionObject0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
      assertEquals(8L, nativeArray1.getLength());
      assertTrue(nativeArray1.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-21));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -21 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineConstProperty(nativeArray0, "");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(10, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2489L);
      NativeError nativeError0 = new NativeError();
      nativeArray0.put("msg.no.overload", (Scriptable) nativeError0, (Object) "~ 0\"O<>#K");
      assertEquals(2489L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray((-486L));
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Array;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      // Undeclared exception!
      try { 
        nativeArray0.put((-821), scriptable0, (Object) nativeIterator_StopIteration0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: -821.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-625));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -625 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2084L));
      Context context0 = new Context();
      NativeNumber nativeNumber0 = new NativeNumber((-529.0044));
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeNumber0, false);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, (-904));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeObject0, (ScriptableObject) nativeObject0, true);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1329L));
      nativeArray0.delete((-2147268920));
      assertEquals((-1329L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.defineConstProperty(nativeArray0, " J^lL-L9pLT]I");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(4, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      int int0 = nativeArray0.findPrototypeId("Invalid token: ");
      assertEquals(0, int0);
      assertEquals(4294967295L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.getAttributes((int) (byte)4);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(8);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(7);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 7 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      boolean boolean0 = nativeArray0.has(1, (Scriptable) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(idFunctionObject0).hasTag(any());
      doReturn((RuntimeException) null).when(idFunctionObject0).unknown();
      Context context0 = Context.getContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405322L);
      Context context0 = Context.getContext();
      Long long0 = new Long(3142L);
      nativeArray0.getOwnPropertyDescriptor(context0, long0);
      assertEquals(9218868437227405322L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray nativeArray0 = new NativeArray(3332L);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context1 = contextFactory0.enterContext(context0);
      // Undeclared exception!
      try { 
        NativeArray.getLengthProperty(context1, scriptable0);
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
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeArray0.has((-1), (Scriptable) nativeJavaClass0);
      assertEquals(2147483647L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(711L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(8).when(idFunctionObject0).methodId();
      doReturn((Object) null).when(idFunctionObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4320L));
      nativeArray0.delete(199);
      assertEquals((-4320L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405322L);
      Object object0 = nativeArray0.get((long) 1);
      assertEquals(9218868437227405322L, nativeArray0.getLength());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5031L));
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "F%Z", (Object) nativeArray0, 34);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 34
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.putProperty((Scriptable) nativeArray0, "-1", (Object) null);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      NativeString nativeString0 = (NativeString)importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      NativeArray.getLengthProperty(context0, nativeString0);
      assertFalse(nativeString0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(711L);
      NativeArray.init(nativeArray0, true);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(idFunctionObject0).getPrototype();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(13).when(idFunctionObject0).methodId();
      doReturn(nativeArray0).when(idFunctionObject0).getParentScope();
      doReturn("+lI<`LdpNdZvetS").when(idFunctionObject0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(8, nativeIterator_StopIteration0, false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeArray nativeArray1 = (NativeArray)nativeArray0.execIdCall(idFunctionObject0, context0, nativeIterator_StopIteration0, nativeIterator_StopIteration0, objectArray0);
      assertEquals("Array", nativeArray1.getClassName());
      assertEquals(10L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Method[] methodArray0 = new Method[7];
      NativeArray nativeArray0 = new NativeArray(2855L);
      NativeArray nativeArray1 = new NativeArray(methodArray0);
      nativeArray1.put(8, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertEquals(2855L, nativeArray0.getLength());
      assertEquals(7L, nativeArray1.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) importerTopLevel0);
      assertEquals("JavaObject", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(11);
      nativeArray0.get(13, (Scriptable) nativeArray0);
      assertEquals(11L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(674L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(nativeArray0).when(idFunctionObject0).getPrototype();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(13).when(idFunctionObject0).methodId();
      doReturn(nativeArray0).when(idFunctionObject0).getParentScope();
      doReturn("every").when(idFunctionObject0).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(711L);
      ScriptableObject.defineConstProperty(nativeArray0, "+lI<`LdpNdZvetS");
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(711L);
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(48).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 48
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2332L));
      Double double0 = new Double(4);
      ScriptableObject.putProperty((Scriptable) nativeArray0, 13, (Object) double0);
      assertEquals(14L, nativeArray0.getLength());
      assertEquals(14L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.activatePrototypeMap(2998);
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
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(683L);
      nativeArray0.delete(0);
      assertEquals(683L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405322L);
      nativeArray0.delete(8);
      assertEquals(9218868437227405322L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeArray nativeArray0 = new NativeArray(2242L);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, nativeArray0.PERMANENT);
      assertEquals(2242L, nativeArray0.getLength());
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      NativeWith nativeWith0 = new NativeWith(importerTopLevel0, nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty(context0, (Object) nativeWith0, (ScriptableObject) importerTopLevel0, false);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
