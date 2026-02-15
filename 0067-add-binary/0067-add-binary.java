import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
      BigInteger val1 = new BigInteger(a, 2);   // convert binary string into number 
        BigInteger val2 = new BigInteger(b, 2);  // convert binary string into number 
        BigInteger sum = val1.add(val2);        
        return sum.toString(2);   
    }
}