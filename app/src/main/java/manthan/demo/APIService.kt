package manthan.demo

import io.reactivex.Observable
import kotlinx.coroutines.Deferred
import manthan.demo.response.MainModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface APIService {

    @GET(MOVIE_TOP_RATED_API)
    fun getTopRatedMovies(@Query("category") apiKey: String = API_KEY
                          , @Query("per_page") pageIndex: Int): Deferred<Response<MainModel>>

}
