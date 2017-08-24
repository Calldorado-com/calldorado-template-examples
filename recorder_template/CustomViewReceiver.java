//
//  Created by Calldorado Team on August 24th 2017.
//  Copyright © 2017 Calldorado ApS. All rights reserved.
//
//  Licensed under the Calldorado SDK Template License Version 1;
//  you must comply with this license in order to use this file.
//  You may obtain a copy of the License at the following URL:
//  https://github.com/Calldorado-com/calldorado-template-examples
//

package com.your.package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.calldorado.Calldorado;

public class CustomViewReceiver extends BroadcastReceiver {

    private final static String TAG = CustomViewReceiver.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.calldorado.android.intent.SEARCH") ||
                intent.getAction().equals("android.intent.action.PHONE_STATE")) {
            Calldorado.setAftercallCustomView(new AftercallCustomView(context));
            Calldorado.setWicActionCustomView(new WicActionCustomView(context));
        }
    }
}
