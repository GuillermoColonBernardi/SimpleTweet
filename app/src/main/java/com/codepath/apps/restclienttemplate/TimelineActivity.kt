package com.codepath.apps.restclienttemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

class TimelineActivity : AppCompatActivity() {

    lateinit var client: TwitterClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline)

        client = TwitterApplication.getRestClient(this)
        populateHomeTimeline()
    }
    fun populateHomeTimeline(){
        client.getHomeTimeline(object :JsonHttpResponseHandler() {

            override fun onSuccess(statusCode: Int, headers: Headers?, json: JSON?) {
                TODO("Not yet implemented")
                Log.i(TAG,"onSuccess!")
            }

            override fun onFailure(
                statusCode: Int,
                headers: Headers?,
                response: String?,
                throwable: Throwable?
            ) {
                TODO("Not yet implemented")
                Log.i(TAG,"onFailure")
            }

        })
    }
    companion object{
        val TAG = "TimeLineActivity"
    }
}