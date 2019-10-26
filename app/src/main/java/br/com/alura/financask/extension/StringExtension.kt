package br.com.alura.financask.extension

fun String.limitaEmAte(caracteres: Int): String {
    if (this.length > caracteres) {
        val primeiraLetra = 0
        return "${this.substring(primeiraLetra, caracteres)}..."
    }
    return this
}