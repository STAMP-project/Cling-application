/*

 * Tue Mar 03 18:43:04 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Arguments;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.annotation.Annotation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("", class0, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable(";Ut`");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeError nativeError1 = (NativeError)ScriptableObject.ensureScriptable(nativeError0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Boolean;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      context0.getElements(baseFunction0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = ScriptableObject.getPropertyIds((Scriptable) null);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject.putConstProperty(nativeObject0, (String) null, nativeObject0);
      assertFalse(nativeObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeIterator_StopIteration0, (-1098));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeObject0, "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse(">>CPvj2d3r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<Arguments> class0 = Arguments.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeArray0, (-236), class0);
      assertTrue(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = Context.getContext();
      BaseFunction baseFunction0 = new BaseFunction();
      BoundFunction boundFunction0 = null;
      try {
        boundFunction0 = new BoundFunction(context0, nativeError0, baseFunction0, nativeError0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.BoundFunction", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = (NativeIterator.StopIteration)NativeIterator.getStopIterationObject(importerTopLevel0);
      assertEquals("object", nativeIterator_StopIteration0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.getTopScopeValue(nativeError0, ">>CPvj2d3r");
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Object object0 = NativeIterator.getStopIterationObject(scriptable0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray();
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeArray nativeArray0 = new NativeArray(8);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeError0, nativeError0, 2);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      nativeArray0.defineOwnProperty(context0, "c`a_rz}t", scriptableObject0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject.redefineProperty(nativeError0, "", true);
      assertTrue(nativeError0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray(0);
      boolean boolean0 = nativeArray0.isGenericDescriptor(nativeObject0);
      assertTrue(nativeArray0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.defineConstProperty((Scriptable) null, "language version");
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
  public void test19()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.exportAsJSClass(4, (Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Object.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = nativeError0.exportAsJSClass(15, nativeContinuation0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.putProperty((Scriptable) idFunctionObject0, 2, (Object) ">>CPvj2d3r");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 2.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) nativeContinuation0, "U@", context0.emptyArgs);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: U@ is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Arguments> class0 = Arguments.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeIterator_StopIteration0, "", class0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      nativeObject0.defineOwnProperties(context0, nativeBoolean0);
      assertTrue(nativeBoolean0.isExtensible());
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject("");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context.getContext();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeArray nativeArray0 = new NativeArray(13);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(65535, nativeError0, true);
      idFunctionObject0.exportAsJSClass(110, nativeArray0, true);
      assertTrue(nativeArray0.isSealed());
      assertEquals(1, idFunctionObject0.methodId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = ScriptableObject.getPropertyIds(nativeArray0);
      assertEquals(0, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3);
      Class<Integer> class0 = Integer.class;
      nativeArray0.defineProperty("r2=Pp", class0, 3);
      assertTrue(nativeArray0.isExtensible());
  }
}
