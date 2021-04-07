package com.example.simple_mvp.Presenter

import com.example.simple_mvp.View.LuasView

class LuasPresenter(
    private val luasView: LuasView
) {
    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float) {
        val hasil = panjang * lebar

        luasView.hasilLuasPersegiPanjang(hasil)
    }
}