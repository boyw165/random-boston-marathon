enum class Gender {
    F,
    M
}

data class Winner(
    val year: Int,
    val name: String,
    val country: String,
    val time: Int,
    val gender: Gender
)

private val winners: List<Winner> = listOf(
    Winner(year = 1966, name = "Gibb,Roberta", country = "USA", time = 12100, gender = Gender.F),
    Winner(year = 1967, name = "Gibb,Roberta", country = "USA", time = 12437, gender = Gender.F),
    Winner(year = 1968, name = "Gibb,Roberta", country = "USA", time = 12600, gender = Gender.F),
    Winner(year = 1969, name = "Berman,Sara Mae", country = "USA", time = 12166, gender = Gender.F),
    Winner(year = 1970, name = "Berman,Sara Mae", country = "USA", time = 11107, gender = Gender.F),
    Winner(year = 1971, name = "Berman,Sara Mae", country = "USA", time = 11310, gender = Gender.F),
    Winner(year = 1972, name = "Kuscsik,Nina", country = "USA", time = 11426, gender = Gender.F),
    Winner(year = 1973, name = "Hansen,Jacqueline", country = "USA", time = 11159, gender = Gender.F),
    Winner(year = 1974, name = "Gorman,Miki", country = "USA", time = 10031, gender = Gender.F),
    Winner(year = 1975, name = "Winter,Liane", country = "FRG", time = 9744, gender = Gender.F),
    Winner(year = 1976, name = "Merritt,Kim", country = "USA", time = 10030, gender = Gender.F),
    Winner(year = 1977, name = "Gorman,Miki", country = "USA", time = 10113, gender = Gender.F),
    Winner(year = 1978, name = "Barron,Gayle S.", country = "USA", time = 9892, gender = Gender.F),
    Winner(year = 1979, name = "Benoit,Joan", country = "USA", time = 9315, gender = Gender.F),
    Winner(year = 1980, name = "Gareau,Jacqueline", country = "CAN", time = 9268, gender = Gender.F),
    Winner(year = 1981, name = "Roe,Allison", country = "NZL", time = 8806, gender = Gender.F),
    Winner(year = 1982, name = "Teske,Charlotte", country = "FRG", time = 8973, gender = Gender.F),
    Winner(year = 1983, name = "Benoit,Joan", country = "USA", time = 8563, gender = Gender.F),
    Winner(year = 1984, name = "Moller,Lorraine", country = "NZL", time = 8968, gender = Gender.F),
    Winner(year = 1985, name = "Weidenbach,Lisa Larsen", country = "USA", time = 9246, gender = Gender.F),
    Winner(year = 1986, name = "Kristiansen,Ingrid", country = "NOR", time = 8695, gender = Gender.F),
    Winner(year = 1987, name = "Mota,Rosa", country = "POR", time = 8721, gender = Gender.F),
    Winner(year = 1988, name = "Mota,Rosa", country = "POR", time = 8670, gender = Gender.F),
    Winner(year = 1989, name = "Kristiansen,Ingrid", country = "NOR", time = 8673, gender = Gender.F),
    Winner(year = 1990, name = "Mota,Rosa", country = "POR", time = 8724, gender = Gender.F),
    Winner(year = 1991, name = "Panfil,Wanda", country = "POL", time = 8658, gender = Gender.F),
    Winner(year = 1992, name = "Markova,Olga", country = "RUS", time = 8623, gender = Gender.F),
    Winner(year = 1993, name = "Markova,Olga", country = "RUS", time = 8727, gender = Gender.F),
    Winner(year = 1994, name = "Pippig,Uta", country = "GER", time = 8505, gender = Gender.F),
    Winner(year = 1995, name = "Pippig,Uta", country = "GER", time = 8711, gender = Gender.F),
    Winner(year = 1996, name = "Pippig,Uta", country = "GER", time = 8832, gender = Gender.F),
    Winner(year = 1997, name = "Roba,Fatuma", country = "ETH", time = 8783, gender = Gender.F),
    Winner(year = 1998, name = "Roba,Fatuma", country = "ETH", time = 8601, gender = Gender.F),
    Winner(year = 1999, name = "Roba,Fatuma", country = "ETH", time = 8605, gender = Gender.F),
    Winner(year = 2000, name = "Ndereba,Catherine", country = "KEN", time = 8771, gender = Gender.F),
    Winner(year = 2001, name = "Ndereba,Catherine", country = "KEN", time = 8633, gender = Gender.F),
    Winner(year = 2002, name = "Okayo,Margaret", country = "KEN", time = 8443, gender = Gender.F),
    Winner(year = 2003, name = "Zakharova,Svetlana", country = "RUS", time = 8719, gender = Gender.F),
    Winner(year = 2004, name = "Ndereba,Catherine", country = "KEN", time = 8667, gender = Gender.F),
    Winner(year = 2005, name = "Ndereba,Catherine", country = "KEN", time = 8712, gender = Gender.F),
    Winner(year = 2006, name = "Jeptoo,Rita", country = "KEN", time = 8618, gender = Gender.F),
    Winner(year = 2007, name = "Grigoryeva,Lidiya", country = "RUS", time = 8958, gender = Gender.F),
    Winner(year = 2008, name = "Tune,Dire", country = "ETH", time = 8725, gender = Gender.F),
    Winner(year = 2009, name = "Kosgei,Salina", country = "KEN", time = 9136, gender = Gender.F),
    Winner(year = 2010, name = "Erkesso,Teyba", country = "ETH", time = 8771, gender = Gender.F),
    Winner(year = 2011, name = "Kilel,Caroline", country = "KEN", time = 8556, gender = Gender.F),
    Winner(year = 2012, name = "Cherop,Sharon", country = "KEN", time = 9110, gender = Gender.F),
    Winner(year = 2013, name = "Jeptoo,Rita", country = "KEN", time = 8785, gender = Gender.F),
    Winner(year = 2014, name = "Deba,Bizunesh", country = "ETH", time = 8399, gender = Gender.F),
    Winner(year = 2014, name = "Jeptoo,Rita", country = "KEN", time = 8337, gender = Gender.F),
    Winner(year = 2015, name = "Rotich,Caroline", country = "KEN", time = 8695, gender = Gender.F),
    Winner(year = 2016, name = "Baysa,Atsede", country = "ETH", time = 8959, gender = Gender.F),
    Winner(year = 2017, name = "Kiplagat,Edna", country = "KEN", time = 8512, gender = Gender.F),
    Winner(year = 2018, name = "Linden,Desi", country = "USA", time = 9594, gender = Gender.F),
    Winner(year = 1897, name = "McDermott,John J.", country = "USA", time = 10510, gender = Gender.M),
    Winner(year = 1898, name = "MacDonald,Ronald J.", country = "CAN", time = 9720, gender = Gender.M),
    Winner(year = 1899, name = "Brignolia,Lawrence", country = "USA", time = 10478, gender = Gender.M),
    Winner(year = 1900, name = "Caffery,John", country = "CAN", time = 9584, gender = Gender.M),
    Winner(year = 1901, name = "Caffery,John", country = "CAN", time = 8963, gender = Gender.M),
    Winner(year = 1902, name = "Mellor,Sammy", country = "USA", time = 9792, gender = Gender.M),
    Winner(year = 1903, name = "Lorden,John", country = "USA", time = 9689, gender = Gender.M),
    Winner(year = 1904, name = "Spring,Michael", country = "USA", time = 9484, gender = Gender.M),
    Winner(year = 1905, name = "Lorz,Frederick", country = "USA", time = 9505, gender = Gender.M),
    Winner(year = 1906, name = "Ford,Tim", country = "USA", time = 9945, gender = Gender.M),
    Winner(year = 1907, name = "Longboat,Thomas", country = "CAN", time = 8664, gender = Gender.M),
    Winner(year = 1908, name = "Morrissey,Thomas", country = "USA", time = 8743, gender = Gender.M),
    Winner(year = 1909, name = "Renaud,Henri", country = "USA", time = 10416, gender = Gender.M),
    Winner(year = 1910, name = "Cameron,Fred", country = "CAN", time = 8932, gender = Gender.M),
    Winner(year = 1911, name = "DeMar,Clarence", country = "USA", time = 8499, gender = Gender.M),
    Winner(year = 1912, name = "Ryan,Michael", country = "USA", time = 8478, gender = Gender.M),
    Winner(year = 1913, name = "Carlson,Fritz", country = "USA", time = 8714, gender = Gender.M),
    Winner(year = 1914, name = "Duffy,James", country = "CAN", time = 8714, gender = Gender.M),
    Winner(year = 1915, name = "Fabre,Édouard", country = "CAN", time = 9101, gender = Gender.M),
    Winner(year = 1916, name = "Roth,Arthur", country = "USA", time = 8836, gender = Gender.M),
    Winner(year = 1917, name = "Bill Kennedy", country = "USA", time = 8917, gender = Gender.M),
    Winner(year = 1919, name = "Linder,Carl", country = "USA", time = 8953, gender = Gender.M),
    Winner(year = 1920, name = "Trivoulides,Peter", country = "USA", time = 8971, gender = Gender.M),
    Winner(year = 1921, name = "Zuna,Frank", country = "USA", time = 8337, gender = Gender.M),
    Winner(year = 1922, name = "DeMar,Clarence", country = "USA", time = 8290, gender = Gender.M),
    Winner(year = 1923, name = "DeMar,Clarence", country = "USA", time = 8627, gender = Gender.M),
    Winner(year = 1924, name = "DeMar,Clarence", country = "USA", time = 8980, gender = Gender.M),
    Winner(year = 1925, name = "Mellor,Charles", country = "USA", time = 9180, gender = Gender.M),
    Winner(year = 1926, name = "Miles,Johnny", country = "CAN", time = 8740, gender = Gender.M),
    Winner(year = 1927, name = "DeMar,Clarence", country = "USA", time = 9622, gender = Gender.M),
    Winner(year = 1928, name = "DeMar,Clarence", country = "USA", time = 9427, gender = Gender.M),
    Winner(year = 1929, name = "Miles,Johnny", country = "CAN", time = 9188, gender = Gender.M),
    Winner(year = 1930, name = "DeMar,Clarence", country = "USA", time = 9288, gender = Gender.M),
    Winner(year = 1931, name = "Henigan,James", country = "USA", time = 10005, gender = Gender.M),
    Winner(year = 1932, name = "DeBruyn,Paul", country = "GER", time = 9216, gender = Gender.M),
    Winner(year = 1933, name = "Pawson,Leslie S.", country = "USA", time = 9061, gender = Gender.M),
    Winner(year = 1934, name = "Komonen,Dave", country = "CAN", time = 9173, gender = Gender.M),
    Winner(year = 1935, name = "Kelley,John A.", country = "USA", time = 9127, gender = Gender.M),
    Winner(year = 1936, name = "Brown,Ellison", country = "USA", time = 9220, gender = Gender.M),
    Winner(year = 1937, name = "Young,Walter", country = "CAN", time = 9200, gender = Gender.M),
    Winner(year = 1938, name = "Pawson,Leslie S.", country = "USA", time = 9334, gender = Gender.M),
    Winner(year = 1939, name = "Brown,Ellison", country = "USA", time = 8931, gender = Gender.M),
    Winner(year = 1940, name = "Côté,Gérard", country = "CAN", time = 8908, gender = Gender.M),
    Winner(year = 1941, name = "Pawson,Leslie S.", country = "USA", time = 9038, gender = Gender.M),
    Winner(year = 1942, name = "Smith,Joe", country = "USA", time = 8811, gender = Gender.M),
    Winner(year = 1943, name = "Côté,Gérard", country = "CAN", time = 8905, gender = Gender.M),
    Winner(year = 1944, name = "Côté,Gérard", country = "CAN", time = 9110, gender = Gender.M),
    Winner(year = 1945, name = "Kelley,John A.", country = "USA", time = 9040, gender = Gender.M),
    Winner(year = 1946, name = "Kyriakides,Stylianos", country = "GRE", time = 8967, gender = Gender.M),
    Winner(year = 1947, name = "Suh Yun-bok", country = "KOR", time = 8739, gender = Gender.M),
    Winner(year = 1948, name = "Côté,Gérard", country = "CAN", time = 9062, gender = Gender.M),
    Winner(year = 1949, name = "Leandersson,Karl", country = "SWE", time = 9110, gender = Gender.M),
    Winner(year = 1950, name = "Ham Kee-Yong", country = "KOR", time = 9159, gender = Gender.M),
    Winner(year = 1951, name = "Tanaka,Shigeki", country = "JPN", time = 8865, gender = Gender.M),
    Winner(year = 1952, name = "Florea,Doroteo", country = "GUA", time = 9113, gender = Gender.M),
    Winner(year = 1953, name = "Yamada,Keizo", country = "JPN", time = 8331, gender = Gender.M),
    Winner(year = 1954, name = "Karvonen,Veikko", country = "FIN", time = 8439, gender = Gender.M),
    Winner(year = 1955, name = "Hamamura,Hideo", country = "JPN", time = 8302, gender = Gender.M),
    Winner(year = 1956, name = "Viskari,Antti", country = "FIN", time = 8054, gender = Gender.M),
    Winner(year = 1957, name = "Kelley,John J.", country = "USA", time = 8405, gender = Gender.M),
    Winner(year = 1958, name = "Mihalic,Franjo", country = "YUG", time = 8754, gender = Gender.M),
    Winner(year = 1959, name = "Oksanen,Eino", country = "FIN", time = 8562, gender = Gender.M),
    Winner(year = 1960, name = "Kotila,Paavo", country = "FIN", time = 8454, gender = Gender.M),
    Winner(year = 1961, name = "Oksanen,Eino", country = "FIN", time = 8619, gender = Gender.M),
    Winner(year = 1962, name = "Oksanen,Eino", country = "FIN", time = 8628, gender = Gender.M),
    Winner(year = 1963, name = "Vandendriessche,Aurèle", country = "BEL", time = 8338, gender = Gender.M),
    Winner(year = 1964, name = "Vandendriessche,Aurèle", country = "BEL", time = 8399, gender = Gender.M),
    Winner(year = 1965, name = "Shigematsu,Morio", country = "JPN", time = 8193, gender = Gender.M),
    Winner(year = 1966, name = "Kimihara,Kenji", country = "JPN", time = 8231, gender = Gender.M),
    Winner(year = 1967, name = "McKenzie,Dave", country = "NZL", time = 8145, gender = Gender.M),
    Winner(year = 1968, name = "Burfoot,Amby", country = "USA", time = 8537, gender = Gender.M),
    Winner(year = 1969, name = "Unetani,Yoshiaki", country = "JPN", time = 8029, gender = Gender.M),
    Winner(year = 1970, name = "Hill,Ron", country = "GBR", time = 7830, gender = Gender.M),
    Winner(year = 1971, name = "Mejia,Alvaro", country = "COL", time = 8325, gender = Gender.M),
    Winner(year = 1972, name = "Suomalainen,Olavi", country = "FIN", time = 8139, gender = Gender.M),
    Winner(year = 1973, name = "Anderson,Jon", country = "USA", time = 8163, gender = Gender.M),
    Winner(year = 1974, name = "Cusack,Neil", country = "IRL", time = 8019, gender = Gender.M),
    Winner(year = 1975, name = "Rodgers,Bill", country = "USA", time = 7795, gender = Gender.M),
    Winner(year = 1976, name = "Fultz,Jack", country = "USA", time = 8419, gender = Gender.M),
    Winner(year = 1977, name = "Drayton,Jerome", country = "CAN", time = 8086, gender = Gender.M),
    Winner(year = 1978, name = "Rodgers,Bill", country = "USA", time = 7813, gender = Gender.M),
    Winner(year = 1979, name = "Rodgers,Bill", country = "USA", time = 7767, gender = Gender.M),
    Winner(year = 1980, name = "Rodgers,Bill", country = "USA", time = 7931, gender = Gender.M),
    Winner(year = 1981, name = "Seko,Toshihiko", country = "JPN", time = 7766, gender = Gender.M),
    Winner(year = 1982, name = "Salazar,Alberto", country = "USA", time = 7732, gender = Gender.M),
    Winner(year = 1983, name = "Meyer,Greg", country = "USA", time = 7740, gender = Gender.M),
    Winner(year = 1984, name = "Smith,Geoff", country = "GBR", time = 7834, gender = Gender.M),
    Winner(year = 1985, name = "Smith,Geoff", country = "GBR", time = 8045, gender = Gender.M),
    Winner(year = 1986, name = "de Castella,Robert", country = "AUS", time = 7671, gender = Gender.M),
    Winner(year = 1987, name = "Seko,Toshihiko", country = "JPN", time = 7910, gender = Gender.M),
    Winner(year = 1988, name = "Hussein,Ibrahim", country = "KEN", time = 7723, gender = Gender.M),
    Winner(year = 1989, name = "Mekonnen,Abebe", country = "ETH", time = 7746, gender = Gender.M),
    Winner(year = 1990, name = "Bordin,Gelindo", country = "ITA", time = 7699, gender = Gender.M),
    Winner(year = 1991, name = "Hussein,Ibrahim", country = "KEN", time = 7866, gender = Gender.M),
    Winner(year = 1992, name = "Hussein,Ibrahim", country = "KEN", time = 7694, gender = Gender.M),
    Winner(year = 1993, name = "Ndeti,Cosmas", country = "KEN", time = 7773, gender = Gender.M),
    Winner(year = 1994, name = "Ndeti,Cosmas", country = "KEN", time = 7635, gender = Gender.M),
    Winner(year = 1995, name = "Ndeti,Cosmas", country = "KEN", time = 7762, gender = Gender.M),
    Winner(year = 1996, name = "Tanui,Moses", country = "KEN", time = 7755, gender = Gender.M),
    Winner(year = 1997, name = "Aguta,Lameck", country = "KEN", time = 7834, gender = Gender.M),
    Winner(year = 1998, name = "Tanui,Moses", country = "KEN", time = 7654, gender = Gender.M),
    Winner(year = 1999, name = "Chebet,Joseph", country = "KEN", time = 7792, gender = Gender.M),
    Winner(year = 2000, name = "Lagat,Elijah", country = "KEN", time = 7787, gender = Gender.M),
    Winner(year = 2001, name = "Lee Bong-Ju", country = "KOR", time = 7783, gender = Gender.M),
    Winner(year = 2002, name = "Rop,Rodgers", country = "KEN", time = 7742, gender = Gender.M),
    Winner(year = 2003, name = "Cheruiyot,Robert Kipkoech", country = "KEN", time = 7811, gender = Gender.M),
    Winner(year = 2004, name = "Cherigat,Timothy", country = "KEN", time = 7837, gender = Gender.M),
    Winner(year = 2005, name = "Negussie,Hailu", country = "ETH", time = 7904, gender = Gender.M),
    Winner(year = 2006, name = "Cheruiyot,Robert Kipkoech", country = "KEN", time = 7634, gender = Gender.M),
    Winner(year = 2007, name = "Cheruiyot,Robert Kipkoech", country = "KEN", time = 8053, gender = Gender.M),
    Winner(year = 2008, name = "Cheruiyot,Robert Kipkoech", country = "KEN", time = 7665, gender = Gender.M),
    Winner(year = 2009, name = "Merga,Deriba", country = "ETH", time = 7722, gender = Gender.M),
    Winner(year = 2010, name = "Cheruiyot,Robert Kiprono", country = "KEN", time = 7552, gender = Gender.M),
    Winner(year = 2011, name = "Mutai,Geoffrey", country = "KEN", time = 7382, gender = Gender.M),
    Winner(year = 2012, name = "Korir,Wesley", country = "KEN", time = 7960, gender = Gender.M),
    Winner(year = 2013, name = "Desisa Benti,Lelisa", country = "ETH", time = 7822, gender = Gender.M),
    Winner(year = 2014, name = "Meb,Keflezighi", country = "USA", time = 7717, gender = Gender.M),
    Winner(year = 2015, name = "Desisa Benti,Lelisa", country = "ETH", time = 7757, gender = Gender.M),
    Winner(year = 2016, name = "Lemi,Berhanu Hayle", country = "ETH", time = 7965, gender = Gender.M),
    Winner(year = 2017, name = "Kirui,Geoffrey", country = "KEN", time = 7777, gender = Gender.M),
    Winner(year = 2018, name = "Kawauchi,Yuki", country = "JPN", time = 8158, gender = Gender.M)
)

fun main(args: Array<String>) {
    // Sort the data by year.
    val winnersByYear = winners.sortedBy { it.year }
        // From most recent to least recent.
        .reversed()

    // 1. Most recent year that Canada (CAN) won the Boston Marathon (took 5 mins)
    kotlin.run {
        // println("winnersByYear: $winnersByYear")

        // Find the answer by finding the first Canada record.
        // Time complexity: O(n)
        val mostRecentCanadaWinner = winnersByYear.firstOrNull { it.country == "CAN" }?.year ?: "Not found"
        
        // Overall time complexity is O(n)
        
        println("1. Most recent year that Canada (CAN) won the Boston Marathon => $mostRecentCanadaWinner")
    }

    // 2. Fastest women's time in the 1980s (took 8 mins)
    kotlin.run {
        // Since the data is sorted by years, a range search is helpful
        // Time complexity: O(n)
        val winnersIn1980s = winners.filter { it.year >= 1980 && it.year < 1990 && it.gender == Gender.F }
        var fastestTime = Int.MAX_VALUE
        var fastestWinner: Winner? = null
        // Time complexity: O(m) where m <= n
        for (winner in winnersIn1980s) {
            if (winner.time < fastestTime) {
                fastestTime = winner.time
                fastestWinner = winner
            }
        }

        // Overall time complexity is O(n)
        
        println("2. Fastest women's time in the 1980s => $fastestWinner")
    }

    // 3. After the United States,the country that has won the 2nd-most number of times (took 17 mins)
    kotlin.run {
        // Group the data by country.
        // Time complexity: O(n)
        val countryRecords = mutableMapOf<String, Int>()
        winners.forEach { 
            val country = it.country
            val times = countryRecords[country] ?: 0
            countryRecords[country] = times + 1
        }
        
        // Sort the country records.
        // Time complexity: O(m x log(m)) where m is the number of country.
        val sortedCountryRecords = countryRecords.toList()
            // Value in ascending order.
            .sortedBy { (_, value) -> value }
            // Value in descending order, which is from the most to the least.
            .reversed()
        
        // println("countryRecords: $countryRecords")
        // println("sortedCountryRecords: $sortedCountryRecords")

        // Find the rank of the USA.
        // Time complexity: O(m) where m is the number of country.
        val usRank = sortedCountryRecords.indexOfFirst { (country, _) -> country == "USA" }
        val ans = if (usRank in 0 until sortedCountryRecords.size - 1) {
            sortedCountryRecords[usRank + 1].first
        } else {
            "Not found"
        }

        println("3. After the United States,the country that has won the 2nd-most number of times => $ans") 
    }
    
    // 4. First year that a woman's time beat the slowest men's winning time (took 8 mins)
    kotlin.run {
        // Find the slowest men's winning time.
        // Time complexity: O(n)
        var slowestMenTime = 0
        winners.forEach {
            val isMale = it.gender == Gender.M
            val time = it.time
            if (isMale && time > slowestMenTime) {
                slowestMenTime = time
            }
        }
        // println("slowestMenTime: $slowestMenTime")

        // Find the first women that beats the time.
        // Time complexity: O(n)
        var womenYear: Int? = null
        for (i in winnersByYear.lastIndex downTo 0) {
            val winner = winnersByYear[i]
            if (winner.gender != Gender.F) continue

            val time = winner.time
            if (time < slowestMenTime) {
                womenYear = winner.year
                break
            }
        }
        val womenYearPrinted = womenYear?.toString() ?: "Not found"

        // Overall time complexity is O(n)

        println("4. First year that a woman's time beat the slowest men's winning time => $womenYearPrinted")
    }
}