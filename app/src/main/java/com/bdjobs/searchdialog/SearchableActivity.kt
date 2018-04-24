package com.bdjobs.searchdialog

import android.app.ListActivity
import android.widget.Toast
import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.util.Log


class SearchableActivity : ListActivity()
{
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SEARCH", "HERE")
        handleIntent(intent)
    }

    public override fun onNewIntent(intent: Intent) {
        setIntent(intent)
        handleIntent(intent)
    }



    private fun handleIntent(intent: Intent) {
        if (Intent.ACTION_SEARCH == intent.action) {
            val query = intent.getStringExtra(SearchManager.QUERY)
            doSearch(query)
        }
    }

    private fun doSearch(queryStr: String) {
        Toast.makeText(applicationContext, queryStr, Toast.LENGTH_LONG).show()
    }


}