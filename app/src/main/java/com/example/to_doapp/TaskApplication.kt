package com.example.to_doapp

import android.app.Application
import com.example.to_doapp.TaskRepository
import com.example.to_doapp.TaskRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class TaskApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    //database instance
    val database by lazy { TaskRoomDatabase.getDatabase(this, applicationScope) }
    //repository instance
    val repository by lazy { TaskRepository(database.taskDao()) }
    //by lazy == sos objektus izveidos pec vajadzibas
}