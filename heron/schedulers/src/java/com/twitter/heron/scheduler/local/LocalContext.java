// Copyright 2016 Twitter. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.twitter.heron.scheduler.local;

import com.twitter.heron.spi.common.Config;
import com.twitter.heron.spi.common.Context;
import com.twitter.heron.spi.common.Misc;

public class LocalContext extends Context {
  public static String workingDirectory(Config config) {
    String workingDirectory = config.getStringValue(
        LocalKeys.get("WORKING_DIRECTORY"), LocalDefaults.get("WORKING_DIRECTORY"));
    return Misc.substitute(config, workingDirectory);
  }
}
