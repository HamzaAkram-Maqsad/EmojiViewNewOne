package com.example.emojiview.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.emojiview.DashboardActivity
import com.example.emojiview.R


class BookMarkAdapter(
    private val context: Context,

    ) : RecyclerView.Adapter<BookMarkAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BookMarkAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.bookmark_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookMarkAdapter.MyViewHolder, position: Int) {
        //holder.bind(list[position])
        holder.itemView.setOnClickListener {

        }

        // if bookmark is true color set musterd if not then dark grey
        holder.bookMarkIcon?.setOnClickListener {

            holder.bookMarkIcon?.setColorFilter(
                ContextCompat.getColor(context, R.color.colorGray),
                PorterDuff.Mode.SRC_IN
            );


        }


    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var videoTitle: TextView? = null
        var videoSubTitle: TextView? = null
        var videoLengthText: TextView? = null
        var videoImage: ImageView? = null
        var bookMarkIcon: ImageView? = null
        var parentLayout: ConstraintLayout? = null


        init {
            videoTitle = itemView.findViewById(R.id.titleText)
            videoImage = itemView.findViewById(R.id.image_container)
            videoSubTitle = itemView.findViewById(R.id.subtitleText)
            videoLengthText = itemView.findViewById(R.id.lengthText)
            bookMarkIcon = itemView.findViewById(R.id.bookmark_icon)
            parentLayout = itemView.findViewById(R.id.parent)
        }

//        @SuppressLint("SetTextI18n")
//        fun bind(course: CourseModel) {
//            title?.text = course.title
//            image?.setImageResource(course.image)
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                progressBar?.setProgress(course.progress, true)
//            } else {
//                progressBar?.progress = course.progress
//            }
//            progressBar?.progressTintList =
//                ColorStateList.valueOf(ContextCompat.getColor(context, course.progressColor))
//        }


    }


    fun go() {

    }

}