/*

 * Tue Mar 03 20:01:13 GMT 2020
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
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Ref;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object object0 = ScriptRuntime.setConst(scriptable0, (Object) null, (Context) null, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<NativeContinuation> class0 = NativeContinuation.class;
      boolean boolean0 = ScriptRuntime.isRhinoRuntimeType(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectProp((Object) null, ":ya{h#:", (Object) null, context0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot set property \":ya{h#:\" of null to \"null\"
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(context0).hasFeature(anyInt());
      Object object0 = ScriptRuntime.getObjectIndex((Object) nativeIterator_StopIteration0, 1607.142512, context0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertNotNull(object0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith(nativeError0, nativeError0);
      // Undeclared exception!
      try { 
        ScriptRuntime.toCharSequence(nativeWith0);
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
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(nativeObject0).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(context1).hasFeature(anyInt());
      ScriptRuntime.setName((Scriptable) null, (Object) null, context1, importerTopLevel0, "language version");
      // Undeclared exception!
      try { 
        ScriptRuntime.toString((Object) importerTopLevel0);
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
  public void test06()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0, nativeJavaClass0);
      boolean boolean0 = ScriptableObject.isTrue(synchronizer0);
      assertTrue(boolean0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectElem((Object) null, (Object) importerTopLevel0, (Object) null, context1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot set property \"com.google.javascript.rhino.head.ImporterTopLevel@71e806d2\" of null to \"null\"
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.enumInit((Object) null, context1, (-4));
      // Undeclared exception!
      try { 
        ScriptRuntime.toString((Object) importerTopLevel0);
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
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = ScriptRuntime.deleteObjectElem(scriptable0, scriptable0, context0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(context0).getOptimizationLevel();
      doReturn(false).when(context0).hasFeature(anyInt());
      ScriptableObject scriptableObject0 = ScriptRuntime.initStandardObjects(context0, (ScriptableObject) null, false);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(context1).hasFeature(anyInt());
      ScriptRuntime.setName((Scriptable) null, (Object) null, context1, importerTopLevel0, "language version");
      // Undeclared exception!
      try { 
        ScriptRuntime.toString((Object) importerTopLevel0);
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
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.refIncrDecr(ref0, context0, 880);
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context1).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context1, false);
      Context context2 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectElem((Object) null, (Object) importerTopLevel0, (Object) null, context2);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot set property \"com.google.javascript.rhino.head.ImporterTopLevel@65871e5\" of null to \"null\"
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertEquals("global", importerTopLevel0.getClassName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      doReturn((Scriptable) null).when(context0).newArray(any(com.google.javascript.rhino.head.Scriptable.class) , anyInt());
      ScriptableObject scriptableObject0 = ScriptRuntime.getGlobal(context0);
      assertEquals("object", scriptableObject0.getTypeOf());
  }
}
