package manthan.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import manthan.demo.databinding.ActivityMainBinding

@AndroidEntryPoint
@ActivityScoped
class MainActivity : BaseActivity<MainViewModel,ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mViewBinding.root)
        initView()
    }
    private fun initView() {
        val manthanAdapter = ManthanAdapter()
        mViewBinding.rcView.layoutManager = LinearLayoutManager(this)
        mViewBinding.rcView.setHasFixedSize(true)
        mViewBinding.rcView.adapter = manthanAdapter.withLoadStateHeaderAndFooter(
            header = MoviesLoadStateAdapter { manthanAdapter.retry() },
            footer = MoviesLoadStateAdapter { manthanAdapter.retry() }
        )
        lifecycleScope.launch {
            mViewModel!!.passengers.collectLatest { pagedData ->
                manthanAdapter.submitData(pagedData)
            }
        }

    }
    override val mViewModel: MainViewModel by viewModels ()


    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
}