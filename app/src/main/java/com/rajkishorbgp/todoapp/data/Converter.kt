package com.rajkishorbgp.todoapp.data

import androidx.room.TypeConverter
import com.rajkishorbgp.todoapp.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}