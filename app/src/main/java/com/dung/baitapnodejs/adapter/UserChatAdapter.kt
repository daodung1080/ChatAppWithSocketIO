package com.dung.baitapnodejs.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dung.baitapnodejs.R
import com.dung.baitapnodejs.model.Chat
import kotlinx.android.synthetic.main.list_item_sender.view.*

class UserChatAdapter(var context: Context, var list: ArrayList<Chat>, var rUsername: String)
    : RecyclerView.Adapter<UserChatAdapter.UserChatHolder>() {

    override fun getItemViewType(position: Int): Int {
        if(rUsername.equals(list.get(position).username)){
            return 0
        }else{
            return 1
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserChatHolder {
        var view: View

        if (p1 == 0){
            view = LayoutInflater.from(context).inflate(R.layout.list_item_sender,p0,false)
        }else{
            view = LayoutInflater.from(context).inflate(R.layout.list_item_reciever,p0,false)
        }

        return UserChatHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserChatHolder, p1: Int) {
        var chat = list.get(p1)
        holder.tvChat.text = chat.chat
        holder.tvName1.text = chat.username
    }

    class UserChatHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvChat = view.tvChat
        var tvName1 = view.tvName
    }
}