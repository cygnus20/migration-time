package com.positron.migrationtimes.adapters

import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.positron.migrationtimes.R
import com.positron.migrationtimes.models.Immigration
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.posts_item_view.view.*

class ImmigrationsRecyclerViewAdapter(private val context: Context, private val immigrations: List<Immigration>,
                                      private val clickListener: (Immigration) -> Unit) :
    RecyclerView.Adapter<ImmigrationsRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.posts_item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return immigrations.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(immigrations[position], clickListener)

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(immig: Immigration, clickListener: (Immigration) -> Unit) {
            itemView.title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Html.fromHtml(immig.title?.rendered, Html.FROM_HTML_MODE_COMPACT).toString()
            } else {
                Html.fromHtml(immig.title?.rendered).toString()
            }
            Picasso.get().load(immig.jetPackFeaturedMediaUrl)
                .fit().centerCrop()
                .into(itemView.thumbnail_imgview)
            itemView.setOnClickListener { clickListener(immig) }

        }
    }

}