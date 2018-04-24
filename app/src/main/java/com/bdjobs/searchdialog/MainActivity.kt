package com.bdjobs.searchdialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.SearchManager
import android.content.Intent
import android.util.Log
import android.widget.Toast
import android.provider.SearchRecentSuggestions




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onSearchRequested()
        handleIntent(intent);
    }

    override fun onNewIntent(intent: Intent) {
        setIntent(intent)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent) {
        if (Intent.ACTION_SEARCH == intent.action) {
            val query = intent.getStringExtra(SearchManager.QUERY)
            Toast.makeText(this,query,Toast.LENGTH_SHORT).show()


            val suggestions = SearchRecentSuggestions(this,
                    MySuggestionProvider.AUTHORITY, MySuggestionProvider.MODE)
            suggestions.saveRecentQuery(query, null)
        }
    }
}
