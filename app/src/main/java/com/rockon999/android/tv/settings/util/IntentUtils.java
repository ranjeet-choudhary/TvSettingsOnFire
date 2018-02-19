/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rockon999.android.tv.settings.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Utility functions for working with Intents.
 */
public final class IntentUtils {

    /**
     * Non instantiable.
     */
    private IntentUtils() {}

    /**
     * Starts an activity.
     * <p>
     * Returns {@code true} if launched successfully.
     */
    public static boolean startActivity(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            // TODO: show toast here?
            return false;
        }
    }

    /**
     * Returns {@code true} if the URI is a content URI pointed at a content provider.
     */
    public static boolean isContentUri(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    /**
     * Returns {@code true} if the URI is a serialized intent.
     */
    public static boolean isIntentUri(Uri uri) {
        return "intent".equals(uri.getScheme());
    }
}
