package ir.kamaliaan.gittest4

class Presenter(view:Contract.View) : Contract.Presenter {

    val v = view


    override fun calculate(): Int {
        return 3*3
    }

    override fun onClick() {
        v.showMessage()
    }


}