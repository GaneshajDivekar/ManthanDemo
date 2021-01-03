package manthan.demo.response


import com.google.gson.annotations.SerializedName

data class MainModelItem(
    val attributes: List<Attribute>,
    @SerializedName("average_rating")
    val averageRating: String,
    val backordered: Boolean,
    val backorders: String,
    @SerializedName("backorders_allowed")
    val backordersAllowed: Boolean,
    @SerializedName("button_text")
    val buttonText: String,
    @SerializedName("catalog_visibility")
    val catalogVisibility: String,
    val categories: List<Category>,
    @SerializedName("cross_sell_ids")
    val crossSellIds: List<Any>,
    @SerializedName("date_created")
    val dateCreated: String,
    @SerializedName("date_created_gmt")
    val dateCreatedGmt: String,
    @SerializedName("date_modified")
    val dateModified: String,
    @SerializedName("date_modified_gmt")
    val dateModifiedGmt: String,
    @SerializedName("date_on_sale_from")
    val dateOnSaleFrom: Any,
    @SerializedName("date_on_sale_from_gmt")
    val dateOnSaleFromGmt: Any,
    @SerializedName("date_on_sale_to")
    val dateOnSaleTo: Any,
    @SerializedName("date_on_sale_to_gmt")
    val dateOnSaleToGmt: Any,
    @SerializedName("default_attributes")
    val defaultAttributes: List<Any>,
    val description: String,
    val dimensions: Dimensions,
    @SerializedName("download_expiry")
    val downloadExpiry: Int,
    @SerializedName("download_limit")
    val downloadLimit: Int,
    val downloadable: Boolean,
    val downloads: List<Any>,
    @SerializedName("external_url")
    val externalUrl: String,
    val featured: Boolean,
    @SerializedName("grouped_products")
    val groupedProducts: List<Any>,
    val id: Int,
    val images: List<Any>,
    @SerializedName("_links")
    val links: Links,
    @SerializedName("manage_stock")
    val manageStock: Boolean,
    @SerializedName("menu_order")
    val menuOrder: Int,
    @SerializedName("meta_data")
    val metaData: List<Any>,
    val name: String,
    @SerializedName("on_sale")
    val onSale: Boolean,
    @SerializedName("parent_id")
    val parentId: Int,
    val permalink: String,
    val price: String,
    @SerializedName("price_html")
    val priceHtml: String,
    val purchasable: Boolean,
    @SerializedName("purchase_note")
    val purchaseNote: String,
    @SerializedName("rating_count")
    val ratingCount: Int,
    @SerializedName("regular_price")
    val regularPrice: String,
    @SerializedName("related_ids")
    val relatedIds: List<Int>,
    @SerializedName("reviews_allowed")
    val reviewsAllowed: Boolean,
    @SerializedName("sale_price")
    val salePrice: String,
    @SerializedName("shipping_class")
    val shippingClass: String,
    @SerializedName("shipping_class_id")
    val shippingClassId: Int,
    @SerializedName("shipping_required")
    val shippingRequired: Boolean,
    @SerializedName("shipping_taxable")
    val shippingTaxable: Boolean,
    @SerializedName("short_description")
    val shortDescription: String,
    val sku: String,
    val slug: String,
    @SerializedName("sold_individually")
    val soldIndividually: Boolean,
    val status: String,
    @SerializedName("stock_quantity")
    val stockQuantity: Any,
    @SerializedName("stock_status")
    val stockStatus: String,
    val tags: List<Any>,
    @SerializedName("tax_class")
    val taxClass: String,
    @SerializedName("tax_status")
    val taxStatus: String,
    @SerializedName("total_sales")
    val totalSales: Int,
    val type: String,
    @SerializedName("upsell_ids")
    val upsellIds: List<Any>,
    val variations: List<Any>,
    val virtual: Boolean,
    val weight: String
)