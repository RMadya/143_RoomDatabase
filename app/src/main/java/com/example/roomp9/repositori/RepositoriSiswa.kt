package com.example.roomp9.repositori

import com.example.roomp9.room.Siswa
import com.example.roomp9.room.SiswaDAO
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun InsertSiswa(siswa: Siswa)

    fun getSiswaStream(id: Int): Flow<Siswa?>

    suspend fun deleteSiswa(siswa: Siswa)

    suspend fun updateSiswa(siswa: Siswa)


}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDAO
):

