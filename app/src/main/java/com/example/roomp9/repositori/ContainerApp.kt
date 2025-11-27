package com.example.roomp9.repositori

import android.app.Application
import android.content.Context
import androidx.room.Database
import com.example.roomp9.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
    ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao())
    }
}

class AplikasiSiswa : Application() {
    /**
     * Appcontainer instance digunakan oleh kelas-kelas lainnya untuk
     * mendapatkan dependensi
     */

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}