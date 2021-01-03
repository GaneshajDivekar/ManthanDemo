package manthan.demo.response


import com.google.gson.annotations.SerializedName

data class Category(
    val id: Int,
    val name: String,
    val slug: String
)