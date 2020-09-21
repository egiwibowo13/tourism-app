package co.id.egiwibowo.tourismapp.core.di

import co.id.egiwibowo.tourismapp.core.data.TourismRepository
import co.id.egiwibowo.tourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}