/*

 * Tue Mar 03 18:53:16 GMT 2020
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
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaConstructor;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.initPrototypeId(12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, nativeObject0, idFunctionObject0, context0.emptyArgs);
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
      String[] stringArray0 = new String[0];
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      nativeObject0.defineFunctionProperties(stringArray0, class0, 1);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Byte> class0 = Byte.class;
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
  public void test04()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<Object> class0 = Object.class;
      importerTopLevel0.defineProperty("com.google.javascript.rhino.head.ScriptableObject$Slot", class0, 6);
      assertFalse(importerTopLevel0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<NativeJavaConstructor> class0 = NativeJavaConstructor.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeIterator_StopIteration0, class0, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeJavaConstructor\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue((Object) null, context0.FEATURE_STRICT_EVAL);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((short) (-1945));
      boolean boolean0 = ScriptableObject.isFalse(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeIterator_StopIteration0, "error reporter");
      boolean boolean0 = nativeIterator_StopIteration0.sameValue("es\"zo.db", object0);
      assertFalse(boolean0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(8, nativeObject0, false);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeIterator_StopIteration0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = new Context();
      Object object0 = nativeIterator_StopIteration0.defaultGet("toString");
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, (Callable) null, nativeIterator_StopIteration0, context0.emptyArgs);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(object0, boundFunction0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "T.0/!Gr";
      Class<Byte> class0 = Byte.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineFunctionProperties(stringArray0, class0, 116);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"T.0/!Gr\" not found in \"java.lang.Byte\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<NativeObject> class0 = NativeObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) null, class0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Long long0 = new Long(0);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(long0, long0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeObject0, class0, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unsupported parameter type \"java.lang.Class\" in method \"com.google.javascript.rhino.head.NativeJavaClass\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.exportAsJSClass(8, nativeObject0, false);
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      Iterator<Object> iterator0 = nativeObject_KeySet0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      nativeIterator_StopIteration0.defaultPut("language version", (Object) null);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineOwnProperties(context0, nativeIterator_StopIteration0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction();
      topLevel0.defineOwnProperties(context0, baseFunction0);
      assertTrue(baseFunction0.isExtensible());
      assertTrue(topLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(idFunctionObject0).getClassName();
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(3).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(context0).hasFeature(anyInt());
      Object object0 = nativeObject0.execIdCall(idFunctionObject0, context0, nativeObject0, idFunctionObject0, context0.emptyArgs);
      assertEquals("[object null]", object0);
      assertTrue(nativeObject0.isExtensible());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.isTrue(nativeIterator_StopIteration0);
      assertTrue(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeCall nativeCall0 = new NativeCall();
      Context context0 = Context.getCurrentContext();
      Float float0 = new Float((float) 140);
      nativeCall0.defineOwnProperty(context0, float0, nativeObject0);
      assertEquals(120, Context.VERSION_1_2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      ScriptableObject.defineClass((Scriptable) nativeObject0, class0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Float float0 = new Float((float) 4);
      nativeIterator_StopIteration0.equivalentValues(float0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeObject0, (String) null, "@>8J-g8;rQ", false);
      // Undeclared exception!
      try { 
        nativeObject0.addLazilyInitializedValue("Ke2P,Ot", (-856), lazilyLoadedCtor0, (-856));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Ke2P,Ot
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      boolean boolean0 = ScriptableObject.isTrue(importerTopLevel0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaTopPackage
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeObject0, nativeObject0, 12);
      nativeObject0.checkPropertyDefinition(scriptableObject0);
      assertNotSame(nativeObject0, scriptableObject0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, false, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Can't define constructor or class com.google.javascript.rhino.head.NativeJavaObject since more than one constructor has multiple parameters.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.initPrototypeId(11);
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
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeObject.init((Scriptable) null, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Object.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeIterator_StopIteration0.checkPropertyChange("kVWRZ`pz3zd.", nativeContinuation0, nativeContinuation0);
      assertTrue(nativeContinuation0.isEmpty());
      assertTrue(nativeContinuation0.isExtensible());
  }
}
