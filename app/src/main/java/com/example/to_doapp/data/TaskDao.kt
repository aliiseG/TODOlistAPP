package com.example.to_doapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Query("SELECT * FROM task_table ORDER BY id ASC")
    fun getTaskOrderedByID(): Flow<List<Task>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(task: Task)

//    @Delete(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun delete(task: Task)

    @Query("DELETE FROM task_table")
    suspend fun deleteAll()
}