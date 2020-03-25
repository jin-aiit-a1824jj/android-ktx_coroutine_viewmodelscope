package a1824jj.jp.ac.aiit.viewmodelscope_sampel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        //mainActivityViewModel.getUserData()
        mainActivityViewModel.users.observe(this, Observer { myUser ->
            myUser.forEach{
                Log.i("MyTag", "name is ${it.name}")
            }

        })
    }
}
