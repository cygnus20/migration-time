package com.positron.migrationtimes.adapters

import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.positron.migrationtimes.R
import com.positron.migrationtimes.models.Visa
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.posts_item_view.view.*

class VisasRecyclerViewAdapter(private val context: Context, private val visas: List<Visa>,
                               private val clickListener: (Visa) -> Unit) :
    RecyclerView.Adapter<VisasRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.posts_item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return visas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(visas[position], clickListener)

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(visa: Visa, clickListener: (Visa) -> Unit) {
            itemView.title_txtView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Html.fromHtml(visa.title?.rendered, Html.FROM_HTML_MODE_COMPACT).toString()
            } else {
                Html.fromHtml(visa.title?.rendered).toString()
            }
            Picasso.get().load(visa.jetPackFeaturedMediaUrl)
                .fit().centerCrop()
                .into(itemView.thumbnail_imgview)
            itemView.setOnClickListener { clickListener(visa) }

        }
    }

}
