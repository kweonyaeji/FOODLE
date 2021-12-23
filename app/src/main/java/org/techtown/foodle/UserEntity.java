package org.techtown.foodle;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="user")
class UserEntity {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo
    public String id;
    @ColumnInfo
    public String password;
    @ColumnInfo
    public String nickname;

}

