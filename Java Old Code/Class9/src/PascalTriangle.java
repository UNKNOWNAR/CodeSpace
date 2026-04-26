import java.io.*;
class PascalTriangle {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter no. of rows:");
int n = Integer.parseInt(br.readLine());
for(int i = 0; i < n; i++) { // for each row
for(int k=0; k < n-i-1; k++) { // print space
System.out.print(" ");
}
for(int j = 0; j < i + 1; j++) { // print values
int val = factorial(i)/(factorial(j)*(factorial(i-j))); // calculate values
System.out.print(val + " "); // space indent
}
System.out.println(); // new line for next row
}
}
static int factorial(int val) { // calculates factorial of a number
int f = 1;
while(val > 0) {
f *= val;
val--;
}
return f;
}
}