package com.devio.hilibrary

import android.app.Application
import com.devio.hilibrary.log.HiConsolePrinter
import com.devio.hilibrary.log.HiLogConfig
import com.devio.hilibrary.log.HiLogManager
import com.google.gson.Gson

class MApplication :Application(){
    override fun onCreate() {
        super.onCreate()

        HiLogManager.init(object :HiLogConfig(){
            override fun getGlobalTag(): String {
                return "MApplication"
            }

            override fun enable(): Boolean {
                return true
            }

            override fun injectJsonParser(): JsonPare {

                return JsonPare { src -> Gson().toJson(src)}
            }
        },HiConsolePrinter())
    }
}