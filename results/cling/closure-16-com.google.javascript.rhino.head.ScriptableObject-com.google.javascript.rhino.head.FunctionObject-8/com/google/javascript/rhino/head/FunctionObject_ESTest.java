/*

 * Tue Mar 03 18:53:52 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeDate;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeMath;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, (Object) null, 8);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Class<Synchronizer> class0 = Synchronizer.class;
      Context context0 = Context.getContext();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      Float float0 = new Float((-616.0017F));
      NativeNumber nativeNumber0 = (NativeNumber)FunctionObject.convertArg(context0, scriptable0, (Object) float0, (Class<?>) class0);
      nativeNumber0.defineConst("error reporter", (Scriptable) null);
      assertTrue(nativeNumber0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4356L);
      // Undeclared exception!
      try { 
        nativeArray0.setAttributes("confiuabl", 4356);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4356
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Class<NativeMath> class0 = NativeMath.class;
      NativeMath nativeMath0 = ScriptableObject.getTypedProperty((Scriptable) baseFunction0, 2, class0);
      assertNull(nativeMath0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) importerTopLevel0, class0, true, true);
      assertNull(baseFunction0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeGenerator nativeGenerator0 = NativeGenerator.init((ScriptableObject) null, false);
      boolean boolean0 = nativeGenerator0.isConst("{*m).IFL8[U`E@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      boolean boolean0 = baseFunction0.has((-1233), (Scriptable) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("msg.change.property.data.to.accessor.with.configurable.false");
      // Undeclared exception!
      try { 
        nativeJavaPackage0.setGetterOrSetter("LP", 1023, baseFunction0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // LP
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = null;
      try {
        baseFunction0 = new BaseFunction((Scriptable) null, (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-9223372036854775808L));
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeContinuation0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(scriptable0, nativeBoolean0, 9);
      assertFalse(scriptableObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<NativeDate> class0 = NativeDate.class;
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, class0, 13);
      nativeIterator_StopIteration0.checkPropertyDefinition(scriptableObject0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put("MKZf*4{%sa", (Scriptable) baseFunction0, (Object) nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) importerTopLevel0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class java.lang.Object
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      String string0 = nativeJavaTopPackage0.getTypeOf();
      assertEquals("object", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeBoolean0.putConst("#;mm5R=)i`3Ot)", importerTopLevel0, "#;mm5R=)i`3Ot)");
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.putConst("Lfzmki[^?NDn", (Scriptable) null, "}~a#z#hG'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(baseFunction0, false);
      baseFunction0.defineConst("jsConstr1ctor", nativeGenerator0);
      assertFalse(nativeGenerator0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      Function function0 = TopLevel.getBuiltinCtor(context0, (Scriptable) importerTopLevel0, topLevel_Builtins0);
      importerTopLevel0.setGetterOrSetter("error reporter", 0, function0, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Float> class0 = Float.class;
      NativeString nativeString0 = new NativeString("");
      NativeArray nativeArray0 = new NativeArray(2884L);
      nativeString0.put((-1842173768), (Scriptable) nativeArray0, (Object) class0);
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(426.4256846);
      ScriptableObject.isFalse(nativeNumber0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Class<NativeArray> class0 = NativeArray.class;
      Scriptable scriptable0 = Context.toObject((Object) context0, (Scriptable) scriptableObject0, (Class<?>) class0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        FunctionObject.convertArg(context0, scriptable0, (Object) nativeContinuation0, 4);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }
}
