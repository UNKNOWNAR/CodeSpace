class Solution {
 /*
  * #3663 Least Frequent Digit
  */
 public static int getLeastFrequentDigit(int number) {
  if (number == 0) return 0;

  final var C = new int[10];

  while (number > 0) {
   final var digit = number % 10;
   C[digit]++;
   number /= 10;
  }

  Integer min = null;
  for (int digit = 0; digit < 10; digit++) {
   final var frequency = C[digit];
   if (frequency == 0) continue;

   if (min == null) min = frequency;
   else min = Math.min(min, frequency);
  }

  for (int digit = 0; digit < 10; digit++)
   if (C[digit] == min) return digit;

  throw new IllegalStateException();
 }
}
