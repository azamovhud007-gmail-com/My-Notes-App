package com.hadeveloper.noteapp;

import android.view.View;



public interface NotesListener {
    void onNoteClicked(View view, Note note, int position);

    void onNoteLongClicked(View view, int position, Note note);

    void onNoteLongClicked(View view, Note note, int position);
}
