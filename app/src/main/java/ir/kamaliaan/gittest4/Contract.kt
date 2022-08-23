package ir.kamaliaan.gittest4

interface Contract {

    interface View{
        fun showMessage()
    }

    interface Presenter{
        fun calculate():Int
        fun onClick()
    }

}