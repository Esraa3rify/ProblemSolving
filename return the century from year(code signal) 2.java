int solution(int year) {
    int century = 0;

    if (year % 100 != 0) {
        century = (year / 100) + 1;
    } else {
        century = year / 100;
    }

    return century;
}
