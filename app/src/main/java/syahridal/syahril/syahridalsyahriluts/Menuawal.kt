package syahridal.syahril.syahridalsyahriluts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_menu_awal.*

/**
 * A simple [Fragment] subclass.
 */
class Menuawal : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_awal, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        buttonConstraint.setOnClickListener {
            nav.navigate(R.id.action_menu_awal_to_constraint)
        }
        buttonLiniear.setOnClickListener {
            nav.navigate(R.id.action_menu_awal_to_liniear)
        }
    }



}
