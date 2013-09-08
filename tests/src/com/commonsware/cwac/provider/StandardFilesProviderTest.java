/***
  Copyright (c) 2013 CommonsWare, LLC
  
  Licensed under the Apache License, Version 2.0 (the "License"); you may
  not use this file except in compliance with the License. You may obtain
  a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package com.commonsware.cwac.provider;

import java.io.File;

public class StandardFilesProviderTest extends AbstractReadWriteProviderTest {
  @Override
  public String getPrefix() {
    return("test-standard");
  }

  @Override
  void assertFileExists(String fileName) {
    File testFile=
        new File(getContext().getFilesDir(), fileName);

    assertTrue(testFile.exists());
  }
}
