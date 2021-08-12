package com.ludmilla.integratorproject.data.di

import com.ludmilla.integratorproject.data.database.FavoriteDatabase
import com.ludmilla.integratorproject.data.repository.FavoriteRepositoryImpl
import com.ludmilla.integratorproject.presentation.viewmodel.MovieViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.scope.get
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MovieViewModel() }
}

val repositoryModule = module {
    single { FavoriteRepositoryImpl(get()) }
}

val daoModule = module {
    single { FavoriteDatabase.getInstance(androidContext()).favoriteDao}
}