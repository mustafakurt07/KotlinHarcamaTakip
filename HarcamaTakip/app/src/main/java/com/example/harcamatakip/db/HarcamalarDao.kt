package com.example.harcamatakip.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.harcamatakip.model.Harcamalar

@Dao
interface HarcamalarDao {

    //Bu  veritabanı ile iletişim interface

    @Query("SELECT * FROM harcamalar")
    fun getAll(): List<Harcamalar>

    @Insert
    fun insertAll(vararg harcama: Harcamalar)

    @Delete
    fun delete(harcama: Harcamalar)
}