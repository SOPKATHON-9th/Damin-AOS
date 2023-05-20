package sopt.haeti.damin_aos

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import timber.log.Timber

class GujoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}