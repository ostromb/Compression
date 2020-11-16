# Compression
Decompresses a string of the As and Bs. i.e. 4(a(3ab)
Input consists of a single (compressed) string from set I, defined as follows:
- I contains the strings a, b, and all the strings na and nb, where n is a number between 1 and 99 (inclusive).
- If the two strings s and t belong to I, then I also contains the compound string st.
- If the string s belongs to I, then I also contains all the strings n (s), where n is a number between 1 and 99 (inclusive).
- No other strings belong to I.

Sample input 1:
11ab
Sample Output 1
aaaaaaaaaaab
Sample Input 2	
4(ab)
Sample Output 2
abababab
Sample Input 3	
2(3b3(ab))
Sample Output 3
bbbabababbbbababab
