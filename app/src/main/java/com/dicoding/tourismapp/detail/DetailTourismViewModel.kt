package com.dicoding.tourismapp.detail

import androidx.lifecycle.ViewModel
import co.id.egiwibowo.tourismapp.core.domain.model.Tourism
import co.id.egiwibowo.tourismapp.core.domain.usecase.TourismUseCase
import javax.inject.Inject

class DetailTourismViewModel @Inject constructor(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

