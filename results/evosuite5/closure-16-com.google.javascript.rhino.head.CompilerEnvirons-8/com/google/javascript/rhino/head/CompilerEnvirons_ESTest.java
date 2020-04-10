/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 07:25:20 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CompilerEnvirons_ESTest extends CompilerEnvirons_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      // Undeclared exception!
      try { 
        compilerEnvirons0.setErrorReporter((ErrorReporter) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.CompilerEnvirons", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      
      Context context0 = new Context();
      context0.setGeneratingDebug(false);
      compilerEnvirons0.initFromContext(context0);
      assertFalse(compilerEnvirons0.isGenerateDebugInfo());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      
      Context context0 = Context.enter();
      compilerEnvirons0.initFromContext(context0);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.isXmlAvailable();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(boolean0);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      int int0 = compilerEnvirons0.getOptimizationLevel();
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(0, int0);
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isGenerateDebugInfo();
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(boolean0);
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.recoverFromErrors());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.isRecordingComments();
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.setAllowSharpComments(false);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.reportWarningAsError());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.isGeneratingSource();
      assertTrue(boolean0);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      assertTrue(compilerEnvirons0.isXmlAvailable());
      
      compilerEnvirons0.setXmlAvailable(false);
      assertFalse(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.getAllowSharpComments();
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertFalse(boolean0);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isStrictMode();
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(boolean0);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.isRecordingLocalJsDocComments();
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.isGenerateObserverCount();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(boolean0);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertFalse(boolean0);
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setGeneratingSource(true);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      
      compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
      assertTrue(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.recoverFromErrors();
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.isIdeMode();
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(boolean0);
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.setGenerateObserverCount(false);
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      int int0 = compilerEnvirons0.getLanguageVersion();
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(0, int0);
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      compilerEnvirons0.setActivationNames(treeSet0);
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.setOptimizationLevel((-1));
      assertEquals((-1), compilerEnvirons0.getOptimizationLevel());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setRecordingLocalJsDocComments(true);
      assertTrue(compilerEnvirons0.isRecordingLocalJsDocComments());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.setGenerateDebugInfo(true);
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      boolean boolean0 = compilerEnvirons0.getWarnTrailingComma();
      assertTrue(boolean0);
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.getActivationNames();
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isRecordingComments());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.reportWarningAsError();
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(boolean0);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      boolean boolean0 = compilerEnvirons0.isReservedKeywordAsIdentifier();
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertEquals(0, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isXmlAvailable());
      assertFalse(compilerEnvirons0.isStrictMode());
      assertTrue(boolean0);
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.getErrorReporter();
      assertTrue(compilerEnvirons0.isStrictMode());
      assertTrue(compilerEnvirons0.isRecordingComments());
      assertFalse(compilerEnvirons0.getAllowSharpComments());
      assertTrue(compilerEnvirons0.recoverFromErrors());
      assertEquals(170, compilerEnvirons0.getLanguageVersion());
      assertTrue(compilerEnvirons0.isReservedKeywordAsIdentifier());
      assertTrue(compilerEnvirons0.isGenerateDebugInfo());
      assertTrue(compilerEnvirons0.isIdeMode());
      assertTrue(compilerEnvirons0.getWarnTrailingComma());
      assertEquals(0, compilerEnvirons0.getOptimizationLevel());
      assertFalse(compilerEnvirons0.isAllowMemberExprAsFunctionName());
      assertFalse(compilerEnvirons0.isGenerateObserverCount());
      assertFalse(compilerEnvirons0.reportWarningAsError());
      assertTrue(compilerEnvirons0.isGeneratingSource());
      assertTrue(compilerEnvirons0.isXmlAvailable());
  }
}
