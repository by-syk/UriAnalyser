/*
 * Copyright 2016-2017 By_syk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.by_syk.lib.urianalyser;

import android.os.Build;

class C {
    public final static int SDK = Build.VERSION.SDK_INT;

    /*
     * Colors for highlighting on light background
     * From Android Studio (Darcula theme)
     * Red, Green, Blue, Gray
     */
    public final static int[] HL_DB = {0xffcc7832, 0xff629755, 0xff6897bb, 0xff808080};
    /*
     * Colors for highlighting on light background
     * From Android Studio (Default theme)
     * Red, Green, Blue, Gray
     */
    public final static int[] HL_LB = {0xff660e7a, 0xff008000, 0xff000080, 0xff808080};
}