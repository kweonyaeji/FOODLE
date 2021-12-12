package org.techtown.foodle;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
    public interface UserDao {
        @Insert
        public void insertAll(UserEntity... users);
    }

