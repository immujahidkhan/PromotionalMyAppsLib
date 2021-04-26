package com.justclack.promoapps

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.justclack.promoapps.databinding.RowItemAppBinding

class PromoAppAdapter(val context: Context, val list: PoJo) :
    RecyclerView.Adapter<PromoAppAdapter.ViewHolder>() {

    class ViewHolder(val binding: RowItemAppBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RowItemAppBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.binding.appName.text = data.name
        Constants.glideApp.loadImageFromPath(data.icon, holder.binding.thumbnail)
        holder.binding.install.setOnClickListener {
            Constants.preventDoubleClick(holder.binding.install)
            try {
                context.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=${data.packageName}")
                    )
                )
            } catch (e: ActivityNotFoundException) {
                context.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=${data.packageName}")
                    )
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}