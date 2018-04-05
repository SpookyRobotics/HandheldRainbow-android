package nyc.jsjrobotics.palmrgb.androidInterfaces

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity

interface IDefaultActivity {
    fun applicationContext(): Context
    fun getActivity(): FragmentActivity
    fun finish()
    fun startActivity(intent: Intent)
    fun showFragment(fragmentToShow: FragmentId, fragmentArguments : Bundle? = null)
    fun showNavigationBar(show: Boolean)
}