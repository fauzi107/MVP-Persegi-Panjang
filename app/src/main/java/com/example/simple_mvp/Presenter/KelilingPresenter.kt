package com.example.simple_mvp.Presenter

import com.example.simple_mvp.View.KelilingView

class KelilingPresenter(
    private val kelilingView: KelilingView
) {
    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float) {
        val hasil = 2 * (panjang + lebar)

        kelilingView.hasilKelilingPersegiPanjang(hasil)
    }
}