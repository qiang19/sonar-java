/*
 * SonarQube Java
 * Copyright (C) 2012 SonarSource
 * sonarqube@googlegroups.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.java;

import org.junit.Test;
import org.sonar.plugins.java.api.JavaCheck;

import java.io.File;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class JavaCheckMessageTest {

  @Test
  public void testAnalyzerMessage() {
    JavaCheck check = mock(JavaCheck.class);
    String messageString = "message";
    JavaCheckMessage javaCheckMessage = new JavaCheckMessage(check, messageString);
    AnalyzerMessage analyzerMessage = new AnalyzerMessage(check, new File("a"), 1, messageString, 0);
    javaCheckMessage.setAnalyzerMessage(analyzerMessage);
    assertThat(javaCheckMessage.getAnalyzerMessage()).isEqualTo(analyzerMessage);
  }
}