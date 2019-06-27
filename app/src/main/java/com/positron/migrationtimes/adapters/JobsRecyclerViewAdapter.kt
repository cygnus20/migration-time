package com.positron.migrationtimes.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.positron.migrationtimes.R
import com.positron.migrationtimes.models.Job
import kotlinx.android.synthetic.main.job_item_view.view.*

class JobsRecyclerViewAdapter(private val context: Context, private val jobs: List<Job>,
                              private val clickListener: (Job) -> Unit) :
    RecyclerView.Adapter<JobsRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.job_item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return jobs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(jobs[position], clickListener)

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(job: Job, clickListener: (Job) -> Unit) {
            itemView.job_title_txtView.text = job.title?.rendered
            itemView.company_name_txtView.text = job.fields?.companyName
            itemView.country_txtView.text = job.fields?.jobLocation

            itemView.setOnClickListener { clickListener(job) }

        }
    }

}
