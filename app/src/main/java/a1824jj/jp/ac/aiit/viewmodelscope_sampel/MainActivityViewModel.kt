package a1824jj.jp.ac.aiit.viewmodelscope_sampel

import a1824jj.jp.ac.aiit.viewmodelscope_sampel.model.UserRepository
import androidx.lifecycle.*
import kotlinx.coroutines.*

class MainActivityViewModel : ViewModel() {

    private var userRepository = UserRepository()
//    var users: MutableLiveData<List<User>> = MutableLiveData()
//
//    fun getUserData(){
//        viewModelScope.launch {
//            var result : List<User>? = null
//            withContext(Dispatchers.IO){
//                result = userRepository.getUsers()
//            }
//            users.value = result
//        }
//    }

    var users = liveData(Dispatchers.IO){
        val result = userRepository.getUsers()
        emit(result)
    }

}