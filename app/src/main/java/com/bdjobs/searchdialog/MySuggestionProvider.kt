package com.bdjobs.searchdialog

import android.content.SearchRecentSuggestionsProvider

class MySuggestionProvider : SearchRecentSuggestionsProvider() {
    companion object {
        val AUTHORITY = "com.bdjobs.searchdialog.MySuggestionProvider"
        val MODE = SearchRecentSuggestionsProvider.DATABASE_MODE_QUERIES
    }

    init {
        setupSuggestions(AUTHORITY, MODE)
    }

}