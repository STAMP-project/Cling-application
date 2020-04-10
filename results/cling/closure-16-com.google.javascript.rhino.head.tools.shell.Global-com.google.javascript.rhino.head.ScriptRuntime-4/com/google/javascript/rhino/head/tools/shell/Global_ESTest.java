/*

 * Tue Mar 03 20:46:13 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.shell.Global;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, delegator0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      assertNotNull(baseFunction0);
      
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) baseFunction0;
      Object object0 = Global.toint32(context0, baseFunction0, objectArray0, baseFunction0);
      assertEquals(0, object0);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[1];
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      // Undeclared exception!
      try { 
        Global.doctest(context0, delegator0, objectArray0, delegator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(importerTopLevel0, context0, 110, 11);
      // Undeclared exception!
      try { 
        Global.spawn(context0, baseFunction0, context0.emptyArgs, idFunctionObject0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Global global0 = new Global();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) importerTopLevel0;
      Delegator delegator0 = new Delegator(global0);
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, delegator0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        Global.pipe(false, pipedInputStream0, pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, importerTopLevel0, context0.emptyArgs, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Object[] objectArray0 = new Object[2];
      Synchronizer synchronizer0 = new Synchronizer(nativeObject0);
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, nativeObject0, objectArray0, synchronizer0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
      Object[] objectArray0 = context0.getElements(baseFunction0);
      assertEquals(1, objectArray0.length);
      assertFalse(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Global global0 = new Global();
      // Undeclared exception!
      try { 
        global0.runDoctest((Context) null, (Scriptable) null, "js>Wx", "msg.bad.radix", (-202));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Delegator delegator0 = new Delegator(importerTopLevel0);
      Global.seal(context0, delegator0, context0.emptyArgs, delegator0);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPRTIES);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        Global.sync((Context) null, delegator0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.sync(context0, delegator0, context0.emptyArgs, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 83);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(4);
      Global.pipe(false, byteArrayInputStream0, byteArrayOutputStream0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(7, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      Object object0 = Global.toint32(context0, nativeArray0, context0.emptyArgs, synchronizer0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readFile((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = new Context();
      context0.getElements(global0);
      Global global1 = (Global)context0.initStandardObjects((ScriptableObject) global0);
      assertFalse(global1.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global();
      int int0 = global0.runDoctest(context0, baseFunction0, "error reporter", "error reporter", 180);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Context context0 = new Context();
          Global global0 = new Global(context0);
          TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
          BaseFunction baseFunction0 = global0.getBuiltinCtor(topLevel_Builtins0);
          Object[] objectArray0 = new Object[2];
          objectArray0[1] = (Object) baseFunction0;
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, objectArray0, baseFunction0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor131.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Scriptable scriptable0 = context0.initStandardObjects((ScriptableObject) nativeArray0);
      assertEquals("Array", scriptable0.getClassName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readUrl((Context) null, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        context0.compileString("&5tc~]z7nf+4uL4GI[p", "&5tc~]z7nf+4uL4GI[p", 140, (Object) null);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // syntax error (&5tc~]z7nf+4uL4GI[p#140)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeArray0, objectArray0, synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }
}
