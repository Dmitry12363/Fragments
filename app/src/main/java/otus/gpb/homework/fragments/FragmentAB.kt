package otus.gpb.homework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val ARG_COLOR = "color"
/**
 * A simple [Fragment] subclass.
 * Use the [FragmentAB.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentAB : Fragment() {
    private var color: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            color = it.getInt(ARG_COLOR)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val v = view.findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.fragment_a_b)
        if (color != null)
            v.setBackgroundColor(color!!)
    }

    companion object {
        @JvmStatic
        fun newInstance(color: Int) =
            FragmentAB().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLOR, color)
                }
            }
    }
}