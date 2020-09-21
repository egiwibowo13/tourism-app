package com.dicoding.tourismapp.di

import co.id.egiwibowo.tourismapp.core.domain.usecase.TourismInteractor
import co.id.egiwibowo.tourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase

}