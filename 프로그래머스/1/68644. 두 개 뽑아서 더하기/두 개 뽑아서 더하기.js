function solution(numbers) {
  const answer = new Set();

  for (let i = 0; i < numbers.length - 1; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      const result = numbers[i] + numbers[j];
      answer.add(result);
    }
  }

  return Array.from(answer).sort((a, b) => a - b);
}