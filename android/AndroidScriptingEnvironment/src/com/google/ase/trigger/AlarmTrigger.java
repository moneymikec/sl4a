/*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ase.trigger;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class AlarmTrigger extends Trigger {
  private static final long serialVersionUID = 3175281973854075190L;

  final Double executionTimeS;
  final String scriptName;

  public AlarmTrigger(Double executionTimeS, String scriptName) {
    this.executionTimeS = executionTimeS;
    this.scriptName = scriptName;
  }

  @Override
  public View getView(Context context) {
    TextView text = new TextView(context);
    text.setText(getScriptName());
    return text;
  }

  /** Returns the name of the script to execute */
  public String getScriptName() {
    return scriptName;
  }
}
