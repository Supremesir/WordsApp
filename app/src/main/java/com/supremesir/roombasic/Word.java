package com.supremesir.roombasic;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author HaoFan Fang
 * @date 2020/3/27 16:31
 */

@Entity
public class Word {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "english_word")
    private String word;
    @ColumnInfo(name = "chinese_meaning")
    private String chineseMeaning;

    Word(String word, String chineseMeaning) {
        this.word = word;
        this.chineseMeaning = chineseMeaning;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    String getChineseMeaning() {
        return chineseMeaning;
    }

    public void setChineseMeaning(String chineseMeaning) {
        this.chineseMeaning = chineseMeaning;
    }
}
