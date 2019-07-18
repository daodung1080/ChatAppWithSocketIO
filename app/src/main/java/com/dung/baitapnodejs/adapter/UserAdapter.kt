package com.dung.baitapnodejs.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dung.baitapnodejs.R
import kotlinx.android.synthetic.main.list_item_user_list.view.*

class UserAdapter(var context: Context, var list: ArrayList<String>)
    : RecyclerView.Adapter<UserAdapter.UserHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.list_item_user_list,p0,false)
        return UserHolder(view)
    }

    override fun onBindViewHolder(holder: UserHolder, p1: Int) {
        var name = list.get(p1)
        holder.tvName.text = name
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName = itemView.tvName
    }

}