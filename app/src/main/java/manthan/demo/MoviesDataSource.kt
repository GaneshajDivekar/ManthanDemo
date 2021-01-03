package manthan.demo
import androidx.paging.PagingSource
import manthan.demo.response.MainModelItem

class MoviesDataSource(var apiService: APIService) : PagingSource<Int, MainModelItem>() {
    private val initialPageIndex: Int = 0
    override suspend fun load(params: LoadParams<Int>): PagingSource.LoadResult<Int, MainModelItem> {
        return try {
            val position = params.key ?: initialPageIndex
            val response = apiService.getTopRatedMovies(API_KEY, perPage).await()
            val items = response.body()
            LoadResult.Page(
                data = items!!,
                prevKey = if (position == initialPageIndex) null else position - 1,
                nextKey = if (items.isEmpty()) null else position + 1

            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}
