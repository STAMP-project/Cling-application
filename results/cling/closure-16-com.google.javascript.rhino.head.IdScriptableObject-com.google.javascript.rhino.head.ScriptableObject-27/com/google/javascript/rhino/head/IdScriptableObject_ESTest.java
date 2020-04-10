/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 03:53:35 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.JavaMembers;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
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
  public void test00()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, classLoader0, (-897), 2);
      nativeJavaTopPackage0.checkPropertyChange("", idFunctionObject0, importerTopLevel0);
      assertTrue(idFunctionObject0.isEmpty());
      assertTrue(idFunctionObject0.isExtensible());
      assertTrue(importerTopLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("msg.invalid.type").when(context0).toString();
      boolean boolean0 = ScriptableObject.isFalse(context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0);
      ScriptableObject.defineConstProperty(nativeArray0, "language version");
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeArray0.defineProperty("", class0, (-2134));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeContinuation0.defineProperty("language version", class0, 120);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 121
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = ScriptableObject.getPropertyIds((Scriptable) null);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) baseFunction0, "hM/amsFgXUXWj>", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: hM/amsFgXUXWj> is not a function, it is function.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray();
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.putConstProperty(nativeContinuation0, "msg.const.redecl", "msg.const.redecl");
      assertFalse(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeIterator_StopIteration0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.sealObject();
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(1585, nativeObject0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: join.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      JavaAdapter.createAdapterWrapper(importerTopLevel0, context0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "error reporter", classLoader0);
      importerTopLevel0.isGenericDescriptor(nativeJavaPackage0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject.putProperty((Scriptable) nativeArray0, 2, (Object) baseFunction0);
      assertTrue(baseFunction0.isExtensible());
      assertEquals(8L, nativeArray0.getLength());
      assertTrue(nativeArray0.isEmpty());
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeIterator_StopIteration0, (-1427));
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Class<String> class0 = String.class;
      ScriptableObject.getTypedProperty((Scriptable) importerTopLevel0, "9", class0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeIterator.StopIteration nativeIterator_StopIteration1 = (NativeIterator.StopIteration)ScriptableObject.ensureScriptable(nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeError0, (Callable) null, nativeError0, (Object[]) null);
      assertTrue(boundFunction0.isExtensible());
      assertTrue(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject.getTopScopeValue(importerTopLevel0, context0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Object object0 = NativeIterator.getStopIterationObject(scriptable0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      boolean boolean0 = importerTopLevel0.isGenericDescriptor(nativeIterator_StopIteration0);
      assertTrue(boolean0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "I";
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        importerTopLevel0.defineFunctionProperties(stringArray0, class0, 170);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"I\" not found in \"java.lang.String\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  @Ignore
  public void test25()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      baseFunction0.defineOwnProperty(context0, importerTopLevel0, importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) importerTopLevel0, (-690), class0);
      assertTrue(importerTopLevel0.isEmpty());
      assertNull(string0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      Class<Object> class0 = Object.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeArray0, class0, false);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      nativeArray0.defineOwnProperty(context0, "error reporter", nativeJavaMethod0);
      // Undeclared exception!
      try { 
        ScriptableObject.redefineProperty(nativeArray0, "error reporter", false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // TypeError: redeclaration of const error reporter.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.exportAsJSClass(4, nativeIterator_StopIteration0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: StopIteration.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }
}
