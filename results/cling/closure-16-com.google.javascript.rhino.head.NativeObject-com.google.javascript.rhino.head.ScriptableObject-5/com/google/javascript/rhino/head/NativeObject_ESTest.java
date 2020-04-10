/*

 * Tue Mar 03 18:53:49 GMT 2020
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
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeWith;
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
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeContinuation> class0 = NativeContinuation.class;
      ScriptableObject.defineClass((Scriptable) nativeIterator_StopIteration0, class0, true);
      assertFalse(nativeIterator_StopIteration0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = new Context();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeCall0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineProperty("R#_[ Hp", class0, 55296);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 55297
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeGenerator> class0 = NativeGenerator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeIterator_StopIteration0, class0, false, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeGenerator\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = new Context();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(6).when(idFunctionObject0).methodId();
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeCall0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        Context.toNumber(nativeIterator_StopIteration0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      NativeWith nativeWith0 = new NativeWith(nativeIterator_StopIteration0, interpretedFunction0);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(nativeWith0, context0);
      assertFalse(boolean0);
      assertTrue(interpretedFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "language version";
      Class<Double> class0 = Double.class;
      // Undeclared exception!
      try { 
        importerTopLevel0.defineFunctionProperties(stringArray0, class0, (-1155));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"language version\" not found in \"java.lang.Double\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(8).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeCall nativeCall0 = new NativeCall();
      Object object0 = nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeCall0, context0.emptyArgs);
      assertTrue(nativeCall0.isExtensible());
      assertNotNull(object0);
      assertEquals("({})", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        nativeObject0.defineOwnProperty(context0, nativeObject0, nativeObject0);
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
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      nativeIterator_StopIteration0.exportAsJSClass(8, interpretedFunction0, true);
      Class<Integer> class0 = Integer.class;
      nativeIterator_StopIteration0.getDefaultValue(class0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      nativeIterator_StopIteration0.defineOwnProperty(context0, importerTopLevel0, importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeIterator_StopIteration0.defineOwnProperties((Context) null, importerTopLevel0);
      assertTrue(importerTopLevel0.isExtensible());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeIterator.StopIteration nativeIterator_StopIteration1 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration1.exportAsJSClass(4519, scriptableObject0, true);
      nativeIterator_StopIteration0.defineOwnProperty(context0, idFunctionObject0, idFunctionObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.IdFunctionObject
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Double double0 = new Double((-1));
      nativeObject0.equivalentValues(double0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeObject0, "error reporter", "error reporter", false, false);
      // Undeclared exception!
      try { 
        nativeObject0.addLazilyInitializedValue("msg.extend.scriptable", 2532, lazilyLoadedCtor0, (-9));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // msg.extend.scriptable
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
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
      NativeObject nativeObject0 = new NativeObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, true, true);
      assertTrue(baseFunction0.isEmpty());
      assertTrue(baseFunction0.isExtensible());
      assertTrue(baseFunction0.isSealed());
      assertTrue(nativeObject0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.exportAsJSClass(101, (Scriptable) null, true);
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
  public void test22()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, nativeJavaClass0, nativeIterator_StopIteration0, context0.emptyArgs);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.checkPropertyChange("com.google.javascript.rhino.head.Ref", nativeObject0, nativeObject0);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      assertFalse(nativeObject0.isSealed());
      
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeObject0, "__defineSetter__", 8);
      nativeObject0.checkPropertyChange("__defineSetter__", scriptableObject0, scriptableObject0);
      assertTrue(nativeObject0.isEmpty());
  }
}
