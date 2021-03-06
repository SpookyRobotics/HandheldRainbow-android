package nyc.jsjrobotics.palmrgb.fragments.createPalette

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nyc.jsjrobotics.palmrgb.androidInterfaces.FragmentWithPresenter
import javax.inject.Inject

class CreatePaletteFragment : FragmentWithPresenter() {

    @Inject
    lateinit var presenter : CreatePalettePresenter

    @Inject
    lateinit var view : CreatePaletteView

    companion object {
        val TAG : String = "CreatePaletteFragment"
    }

    override fun tag(): String = TAG

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setPresenter(presenter)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view.initView(container!!, savedInstanceState)
        presenter.init(fragmentManager!!, view)
        return view.rootXml
    }
}