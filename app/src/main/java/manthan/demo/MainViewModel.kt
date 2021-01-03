package manthan.demo

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(private val apiService: APIService) :
    ViewModel() {
    val passengers = Pager(PagingConfig(pageSize = 10)) {
        MoviesDataSource(apiService)
    }.flow.cachedIn(viewModelScope)
}