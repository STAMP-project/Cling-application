/*

 * Tue Mar 03 18:48:19 GMT 2020
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
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Script;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable(contextFactory0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type com.google.javascript.rhino.head.ContextFactory
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeError nativeError1 = (NativeError)ScriptableObject.ensureScriptable(nativeError0);
      assertTrue(nativeError1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-970L));
      ScriptableObject.defineConstProperty(nativeArray0, "7Fvn%ZZ\"-~");
      assertFalse(nativeArray0.isEmpty());
      assertEquals((-970L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(4, importerTopLevel0, false);
      ScriptableObject.deleteProperty((Scriptable) idFunctionObject0, "error reporter");
      assertFalse(idFunctionObject0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "LCt4>6km";
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeError0.defineFunctionProperties(stringArray0, class0, 11);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"LCt4>6km\" not found in \"java.lang.Object\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaAdapter.runScript((Script) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.JavaAdapter$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = ScriptableObject.isFalse(nativeError0);
      assertTrue(nativeError0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, (Object[]) null);
      assertTrue(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeIterator.getStopIterationObject(nativeBoolean0);
      assertTrue(nativeBoolean0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScriptableObject scriptableObject0 = mock(ScriptableObject.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptableObject0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) scriptableObject0, (-1515), class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeIterator_StopIteration0, 4, class0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertNull(string0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      NativeArray nativeArray0 = new NativeArray((-936L));
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      doReturn(0).when(nativeFunction0).getLanguageVersion();
      doReturn((-1034)).when(nativeFunction0).getParamAndVarCount();
      doReturn(81).when(nativeFunction0).getParamCount();
      doReturn("value", "value", "value", "value", "value").when(nativeFunction0).getParamOrVarName(anyInt());
      NativeCall nativeCall0 = new NativeCall(nativeFunction0, nativeArray0, objectArray0);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      nativeArray0.defineOwnProperty(context0, (Object) null, nativeCall0);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeError0, 8);
      assertTrue(nativeError0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      BaseFunction baseFunction0 = new BaseFunction();
      boolean boolean0 = nativeError0.isGenericDescriptor(baseFunction0);
      assertTrue(baseFunction0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.defineConstProperty((Scriptable) null, "0}DqG");
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
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.exportAsJSClass(2, (Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Object.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeError0, "error reporter", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Class<Integer> class0 = Integer.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeError0, "o ", class0);
      assertTrue(nativeError0.isExtensible());
      assertTrue(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[0];
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod(memberBoxArray0, (String) null);
      assertFalse(nativeJavaMethod0.isSealed());
      
      Class<TopLevel> class0 = TopLevel.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeJavaMethod0, class0, true, true);
      assertTrue(nativeJavaMethod0.isEmpty());
      assertTrue(baseFunction0.isSealed());
      assertTrue(baseFunction0.isExtensible());
      assertTrue(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue((Object) null, importerTopLevel0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject("\"5Or0");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      context0.initStandardObjects((ScriptableObject) nativeError0, false);
      Object object0 = NativeIterator.getStopIterationObject(nativeError0);
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(object0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeError0, false);
      nativeError0.defineOwnProperty(context0, context0, scriptableObject0);
      assertEquals(9, Context.FEATURE_STRICT_EVAL);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      importerTopLevel0.sealObject();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("language version", class0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
