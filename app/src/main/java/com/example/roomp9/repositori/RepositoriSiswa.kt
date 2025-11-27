package com.example.roomp9.repositori

import com.example.roomp9.room.Siswa
import com.example.roomp9.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun InsertSiswa(siswa: Siswa)
}




