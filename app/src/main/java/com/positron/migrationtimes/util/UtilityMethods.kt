package com.positron.migrationtimes.util

import android.support.v7.widget.RecyclerView
import android.view.View
import com.positron.migrationtimes.services.MigrationTimeAPI
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object UtilityMethods {
     fun showErrorMessage(view: View, recyclerView: RecyclerView) {
         recyclerView.visibility = View.GONE
         view.visibility = View.VISIBLE
     }

     fun hideErrorMessage(view: View, recyclerView: RecyclerView) {
         view.visibility = View.GONE
         recyclerView.visibility = View.VISIBLE
     }

     fun showView(view: View) {
         view.visibility = View.VISIBLE
     }

     fun hideView(view: View) {
         view.visibility = View.GONE
     }

     fun migrationTimeService(): MigrationTimeAPI {

         return Retrofit.Builder()
             .baseUrl(Constants.BASE_URL)
             .addConverterFactory(MoshiConverterFactory.create())
             .build().create(MigrationTimeAPI::class.java)

     }
}