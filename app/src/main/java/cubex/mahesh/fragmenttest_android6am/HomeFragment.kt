package cubex.mahesh.fragmenttest_android6am

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
     container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.home,container,
                false)

        v.clickme.setOnClickListener({
                var fManager = activity!!.supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,CoursesFragment())
                tx.addToBackStack("true")
                tx.commit()
        })

        return v
    }

}