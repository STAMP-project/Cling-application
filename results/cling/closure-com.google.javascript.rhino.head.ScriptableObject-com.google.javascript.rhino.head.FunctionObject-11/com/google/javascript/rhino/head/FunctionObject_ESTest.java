/*

 * Tue Mar 03 18:54:14 GMT 2020
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
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.MemberBox;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaConstructor;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeMath;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FunctionObject_ESTest extends FunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      NativeNumber nativeNumber0 = new NativeNumber(9);
      nativeNumber0.defineConst("!jJ?pV", scriptable0);
      assertFalse(nativeNumber0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        topLevel0.setAttributes(53, 53);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 53
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeIterator_StopIteration0, 47);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      boolean boolean0 = topLevel0.isConst("++fCK=ul!lMv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.putProperty((Scriptable) nativeContinuation0, 32, (Object) nativeIterator_StopIteration0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeJavaConstructor nativeJavaConstructor0 = new NativeJavaConstructor((MemberBox) null);
      // Undeclared exception!
      try { 
        nativeCall0.setGetterOrSetter("com.google.javascript.rhino.head.RhinoException", 6, nativeJavaConstructor0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // com.google.javascript.rhino.head.RhinoException
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeArray nativeArray0 = new NativeArray(13);
      // Undeclared exception!
      try { 
        nativeBoolean0.defineOwnProperty(context0, nativeArray0, nativeArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      BaseFunction baseFunction0 = new BaseFunction();
      BoundFunction boundFunction0 = new BoundFunction(context0, baseFunction0, baseFunction0, baseFunction0, context0.emptyArgs);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        FunctionObject.convertArg((Context) null, (Scriptable) baseFunction0, (Object) baseFunction0, 2);
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
      NativeString nativeString0 = new NativeString("Y{O&=4b%K`YirEsL");
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeString0, nativeString0, 8);
      assertFalse(scriptableObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(0L);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeArray0, nativeCall0, (-2217));
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeString nativeString0 = new NativeString("containsAll");
      NativeObject nativeObject0 = new NativeObject();
      nativeArray0.put("containsAll", (Scriptable) nativeString0, (Object) nativeObject0);
      assertFalse(nativeString0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      String string0 = nativeObject0.getTypeOf();
      assertEquals("object", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.putConst("getClassNam", nativeCall0, nativeIterator_StopIteration0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("N`,5.[\"}*0~/i=Fq");
      NativeString nativeString0 = new NativeString("language version");
      // Undeclared exception!
      try { 
        nativeJavaPackage0.putConst("getIds", (Scriptable) null, nativeString0);
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
      NativeCall nativeCall0 = new NativeCall();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      nativeCall0.defineConst("Y{O&=4b%K`YiirEsL", importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      nativeCall0.put(2080, (Scriptable) nativeBoolean0, (Object) nativeBoolean0);
      assertFalse(nativeBoolean0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Class<NativeMath> class0 = NativeMath.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      NativeArray nativeArray0 = new NativeArray(methodArray0);
      Class<NativeString> class1 = NativeString.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class1);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeString
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      Class<NativeMath> class0 = NativeMath.class;
      Method[] methodArray0 = FunctionObject.getMethodList(class0);
      NativeCall nativeCall0 = new NativeCall();
      NativeArray nativeArray0 = new NativeArray(methodArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Error;
      BaseFunction baseFunction0 = importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      nativeArray0.defineOwnProperty(context0, (Object) baseFunction0, (ScriptableObject) nativeCall0, false);
  }
}
