// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.thoughtworks.selenium.corebased;

import com.thoughtworks.selenium.InternalSelenseTestBase;

import org.junit.Test;

public class TestGettingValueOfRadioButton extends InternalSelenseTestBase {
  @Test
  public void testGettingValueOfCheckbox() {
    selenium.open("../tests/html/test_check_uncheck.html");

    String firstRadioLocator = "xpath=//input[@name='base'][1]";
    String secondRadioLocator = "xpath=//input[@name='base'][2]";
    assertEquals("on", selenium.getValue(firstRadioLocator));
    assertEquals("off", selenium.getValue(secondRadioLocator));

    selenium.click(secondRadioLocator);
    assertEquals("off", selenium.getValue(firstRadioLocator));
    assertEquals("on", selenium.getValue(secondRadioLocator));
  }
}