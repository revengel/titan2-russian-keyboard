package com.titan2.russiankeyboard

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Receiver for QUERY_KEYBOARD_LAYOUTS intent.
 * System reads meta-data from manifest to discover keyboard layouts.
 * No runtime logic needed — just registration.
 */
class KeyboardLayoutProviderReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // System reads meta-data from manifest automatically.
        // This method is called but doesn't need to do anything.
    }
}
