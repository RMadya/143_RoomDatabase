package com.example.roomp9.repositori

import android.app.Application
import android.content.Context
import androidx.room.Database
import com.example.roomp9.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

