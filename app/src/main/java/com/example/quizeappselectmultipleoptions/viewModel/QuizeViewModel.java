package com.example.quizeappselectmultipleoptions.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.quizeappselectmultipleoptions.model.QuestionList;
import com.example.quizeappselectmultipleoptions.repository.QuizeRepository;

public class QuizeViewModel extends ViewModel {

    QuizeRepository repository = new QuizeRepository();


    LiveData<QuestionList> questionListLiveData;

    public QuizeViewModel(){
        questionListLiveData = repository.getQuestionFromApi();
    }

    public LiveData<QuestionList> getQuestionListLiveData() {
        return questionListLiveData;
    }
}
