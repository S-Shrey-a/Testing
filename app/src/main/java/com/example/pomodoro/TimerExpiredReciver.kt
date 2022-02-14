package com.example.pomodoro

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.pomodoro.util.NotificationUtil
import com.example.pomodoro.util.PrefUtil

class TimerExpiredReciver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)
        PrefUtil.setTimerState(Timer.TimerState.Stopped,context)
        PrefUtil.setAlarmSetTime(0,context)
    }
}