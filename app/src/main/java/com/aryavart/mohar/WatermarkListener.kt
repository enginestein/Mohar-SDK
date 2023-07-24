package com.aryavart.emon.mohar.watermark

 interface WatermarkListener {
    fun onSuccess()
    fun showLog(log: String?, throwable: Throwable?)
    fun onFailure(message: String?, throwable: Throwable?)
}