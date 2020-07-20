package java.com.bytedance.packagedebug

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bytedance.packagedebug.R.id
import com.bytedance.packagedebug.R.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        findViewById<View>(id.print).setOnClickListener {
            val print = Class.forName("com.bytedance.packagedebug.DebugPrint")
            val showToast = print.getDeclaredMethod("showToast", Context::class.java)
            showToast.isAccessible = true
            showToast.invoke(null, this)
        }
    }
}