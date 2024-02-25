package com.coba.androidkotlin

fun main(args: Array<String>) {
    biodata("Haris", 18, "Berburu ubur-ubur")
}

fun biodata(name:String, usia:Int, hobby:String){
    println("========================")
    println("Nama\t: $name")
    println("Usia\t: $usia")
    println("Hobby\t: $hobby")
    println("========================")
    KategoriUsia(usia)
}

fun KategoriUsia(usia: Int) {
    print("Saya adalah Seorang ")
    if (usia < 12) {
        print("Anak-anak")
    } else if (usia >= 12 && usia < 24) {
        print("Remaja")
    } else {
        print("Dewasa")
    }
}
