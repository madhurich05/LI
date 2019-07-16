const factors = number => Array
    .from(Array(number + 1), (_, i) => i)
    .filter(i => number % i === 0)

 console.log(factors(36)); // [1, 2, 3, 4, 6, 9, 12, 18, 36]
