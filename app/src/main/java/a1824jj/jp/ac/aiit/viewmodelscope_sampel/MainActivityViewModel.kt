package a1824jj.jp.ac.aiit.viewmodelscope_sampel

import a1824jj.jp.ac.aiit.viewmodelscope_sampel.model.User
import a1824jj.jp.ac.aiit.viewmodelscope_sampel.model.UserRepository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

class MainActivityViewModel : ViewModel() {

    private var userRepository = UserRepository()
    var users: MutableLiveData<List<User>> = MutableLiveData()

    fun getUserData(){
        viewModelScope.launch {
            var result : List<User>? = null
            withContext(Dispatchers.IO){
                result = userRepository.getUsers()
            }
            users.value = result;
        }
    }

}