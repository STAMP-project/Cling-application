/*

 * Tue Mar 03 18:55:40 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Script;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      ScriptableObject.defineClass((Scriptable) nativeIterator_StopIteration0, class0, false);
      assertEquals("object", nativeIterator_StopIteration0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeIterator_StopIteration0, (Class<?>) class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineProperty(",*b[v>B!Q-.0A6D", class0, (-6042));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -6041
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter");
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("toString", nativeContinuation0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.checkPropertyChange("%uH,Ro_sxCI>|xo+2b%", nativeContinuation0, nativeJavaPackage1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot change the configurable attribute of \"%uH,Ro_sxCI>|xo+2b%\" from false to true.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, true, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeJavaPackage\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.initPrototypeId(7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Short short0 = new Short((short) (-3673));
      boolean boolean0 = nativeObject0.sameValue(nativeObject0, short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(nativeIterator_StopIteration0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(1, nativeIterator_StopIteration0, false);
      Context context0 = Context.getCurrentContext();
      nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, nativeObject0, nativeObject0, context0.emptyArgs);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeJavaPackage nativeJavaPackage0 = nativeJavaTopPackage0.forcePackage("error reporter", nativeIterator_StopIteration0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineOwnProperty(context0, "9fepQHR=p\"q;", nativeJavaPackage0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: [JavaPackage error reporter.get] is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "6Cw";
      Class<NativeContinuation> class0 = NativeContinuation.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineFunctionProperties(stringArray0, class0, 1574);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"6Cw\" not found in \"com.google.javascript.rhino.head.NativeContinuation\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      assertFalse(nativeIterator_StopIteration0.isSealed());
      
      Class<BaseFunction> class0 = BaseFunction.class;
      ScriptableObject.buildClassCtor((Scriptable) nativeIterator_StopIteration0, class0, false, true);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Short short0 = new Short((short) (-3667));
      Double double0 = new Double(0.0);
      boolean boolean0 = nativeObject0.sameValue(short0, double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        Context.toString((Object) nativeObject0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isTrue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.initPrototypeId(9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.initPrototypeId(8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      nativeIterator_StopIteration0.defineOwnProperties(context0, nativeIterator_StopIteration0);
      assertEquals(140, Context.VERSION_1_4);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Synchronizer> class0 = Synchronizer.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.Synchronizer
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Object object0 = nativeIterator_StopIteration0.equivalentValues(importerTopLevel0);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(object0, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "(D)V", "QZf9u*,OVooJ", false);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.addLazilyInitializedValue("(D)V", 100, lazilyLoadedCtor0, 87);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // (D)V
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      nativeIterator_StopIteration0.defineOwnProperty(context0, importerTopLevel0, baseFunction0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeIterator_StopIteration0, (Class<?>) class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeArray nativeArray0 = new NativeArray((-18L));
      nativeArray0.defineConst("writable", nativeObject0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, nativeArray0, 0, " [Y%2pi", 8, nativeObject0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      idFunctionObject0.defineOwnProperty(context0, " [Y%2pi", nativeObject0);
      assertFalse(nativeObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) null, class0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = new Context();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, nativeContinuation0, nativeIterator_StopIteration0, context0.emptyArgs);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.sealObject();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.remove((Object) "StopIteration");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: StopIteration.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      nativeIterator_StopIteration0.checkPropertyChange("error reporter", nativeIterator_StopIteration0, importerTopLevel0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeJavaPackage nativeJavaPackage0 = nativeJavaTopPackage0.forcePackage("[#nK{XAugI}", nativeIterator_StopIteration0);
      nativeIterator_StopIteration0.checkPropertyChange("!\",cK=H", nativeJavaPackage0, nativeIterator_StopIteration0);
  }
}
