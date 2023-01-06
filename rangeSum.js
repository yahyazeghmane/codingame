function calc(array, n1, n2) {
    if (n1 < n2 && n2 < array.length) {
        var somme = 0;
        for (var i = n1; i <= n2; i++) {
            somme += array[i];
        }
        return somme;
    } else {
        return null;
    }
}