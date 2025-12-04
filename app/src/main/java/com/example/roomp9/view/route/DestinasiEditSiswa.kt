package com.example.roomp9.view.route

import com.example.roomp9.R

object DestinasiEditSiswa {
    object DestinasiEditSiswa : DestinasiNavigasi {
        override val route = "item_edit"
        override val titleRes = R.string.edit_siswa
        const val itemIdArg = "idSiswa"
        val routeWithArgs = "$route/{$itemIdArg}"
    }
}