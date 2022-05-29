package com.example.to_doapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey (autoGenerate = true) val id: Int,
    @ColumnInfo val task_title: String,
    @ColumnInfo val task_description: String,
    @ColumnInfo val task_deadline: String,
    @ColumnInfo val date_created: String) {
}