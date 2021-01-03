package manthan.demo

import android.annotation.SuppressLint
import android.provider.Contacts
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import manthan.demo.databinding.ItemPassengerBinding
import manthan.demo.response.MainModel
import manthan.demo.response.MainModelItem

class ManthanAdapter:PagingDataAdapter<MainModelItem, ManthanAdapter.PassengersViewHolder>(PassengersComparator) {

    override fun onBindViewHolder(holder: ManthanAdapter.PassengersViewHolder, position: Int) {
        val item = getItem(position)
        item?.let {
            holder.bindPassenger(it)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ManthanAdapter.PassengersViewHolder {
        return PassengersViewHolder(
            ItemPassengerBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    inner class PassengersViewHolder(private val binding: ItemPassengerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bindPassenger(item: MainModelItem) = with(binding) {
            //imageViewAirlinesLogo.loadImage("http://image.tmdb.org/t/p/w342"+item.backdropPath)
            textViewNameWithTrips.text = "${item.description}, ${item.description}"
        }
    }

    object PassengersComparator : DiffUtil.ItemCallback<MainModelItem>() {
        override fun areItemsTheSame(oldItem: MainModelItem, newItem: MainModelItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MainModelItem, newItem: MainModelItem): Boolean {
            return oldItem == newItem
        }
    }

}
