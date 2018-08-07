package cubex.mahesh.fragmenttest_android6am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fManager = supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.frag1,HomeFragment())
        tx.commit()

        projects.setOnClickListener({
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,ProjectsFragment())
            tx.addToBackStack("true")
            tx.commit()
        })
        home.setOnClickListener({
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,HomeFragment())
            tx.addToBackStack("true")
            tx.commit()
        })
        courses.setOnClickListener({
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,CoursesFragment())
            tx.addToBackStack("true")
            tx.commit()
        })
    } // onCreate
}
