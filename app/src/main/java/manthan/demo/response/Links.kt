package manthan.demo.response


import com.google.gson.annotations.SerializedName

data class Links(
    val collection: List<Collection>,
    val self: List<Self>
)