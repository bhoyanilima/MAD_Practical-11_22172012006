package com.example.mad_practical_11_22172012006

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PersonAdapter(context:Context,val array:ArrayList<Person>):RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
   inner class PersonViewHolder(val view: View):ViewHolder(view)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonAdapter.PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
        return  PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonAdapter.PersonViewHolder, position: Int) {
        val persondata = array[position]

        holder.view.findViewById<TextView>(R.id.name).text = persondata.name
        holder.view.findViewById<TextView>(R.id.mobile).text = persondata.phoneno
        holder.view.findViewById<TextView>(R.id.email).text = persondata.emailid
        holder.view.findViewById<TextView>(R.id.address).text = persondata.address
    }

    override fun getItemCount(): Int {
        return array.size
    }
}