/*

 * Tue Mar 03 18:55:04 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Evaluator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Script;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeContinuation> class0 = NativeContinuation.class;
      String string0 = ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true, true);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("+bXOc5S tzFnU==u", class0, (-1446));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1445
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeArray> class0 = NativeArray.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, false, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeArray\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.isFalse(nativeIterator_StopIteration0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      boolean boolean0 = nativeObject0.sameValue(nativeObject0, nativeObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(1000000, importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, (Context) null, importerTopLevel0, idFunctionObject0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      boolean boolean0 = nativeObject0.sameValue(importerTopLevel0, context0.VERSION_1_4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "R$c)$f;N";
      Class<NativeObject> class0 = NativeObject.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineFunctionProperties(stringArray0, class0, 180);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"R$c)$f;N\" not found in \"com.google.javascript.rhino.head.NativeObject\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-1239.7585836379));
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, nativeNumber0, nativeNumber0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        Context.toNumber(nativeObject0);
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
  public void test10()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeJavaPackage nativeJavaPackage0 = nativeJavaTopPackage0.forcePackage("__lookupSetter__", nativeGenerator0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.checkPropertyChange("mExuG", nativeGenerator0, nativeJavaPackage0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot change the configurable attribute of \"mExuG\" from false to true.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isTrue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Interpreter interpreter0 = new Interpreter();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Script script0 = context0.compileString("FiL", (Evaluator) interpreter0, errorReporter0, "FiL", 11, (Object) null);
      // Undeclared exception!
      try { 
        JavaAdapter.runScript(script0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // ReferenceError: \"FiL\" is not defined. (FiL#11)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      nativeJavaTopPackage0.forcePackage("jsFunction_", nativeIterator_StopIteration0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineOwnProperties(context0, nativeJavaTopPackage0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: [JavaPackage jsFunction_.get] is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.enter();
      nativeIterator_StopIteration0.defineOwnProperties(context0, nativeIterator_StopIteration0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, "Object", 8, 12);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      Object object0 = nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
      assertEquals("({})", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      EcmaError ecmaError0 = null;
      try {
        ecmaError0 = new EcmaError(nativeIterator_StopIteration0, (String) null, 8, 13, "object");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.equivalentValues("Qe1-WP#-\"");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeObject0, (String) null, (String) null, false);
      assertFalse(nativeObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      Context context0 = Context.getCurrentContext();
      nativeIterator_StopIteration0.defineOwnProperty(context0, nativeObject_KeySet0, nativeIterator_StopIteration0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.addLazilyInitializedValue("toLocaleString", 694, (LazilyLoadedCtor) null, 124);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // toLocaleString
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeContinuation> class0 = NativeContinuation.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeContinuation
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, true, true);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(baseFunction0.isEmpty());
      assertTrue(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.exportAsJSClass(130, nativeObject0, false);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.getIds();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeObject0, nativeJavaClass0, nativeObject0, context0.emptyArgs);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(boundFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.sealObject();
      Long long0 = new Long(0);
      // Undeclared exception!
      try { 
        nativeObject0.remove((Object) long0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 0.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.checkPropertyChange("9I,91$Vm0iR", nativeObject0, nativeObject0);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(nativeObject0.isExtensible());
  }
}
