//first approach
class Solution {
  public int numSteps(String s) {
    var steps = 0;
    var sb = new StringBuilder(s);

    while (sb.length() > 1) {
      var n = sb.length() - 1;

      if (sb.charAt(n) == '0') {
        sb.deleteCharAt(n);
      } else {
        while (n >= 0 && sb.charAt(n) == '1')
          sb.setCharAt(n--, '0');

        if (n < 0) sb.insert(0, '1');
        else sb.setCharAt(n, '1');
      }
      steps++;
    }
    return steps;
  }
}

//2nd Approach
class Solution {
    public int numSteps(String s) {
        int res = 0, carry = 0;

        for(int i = s.length() - 1; i> 0; i--){
            res++;
            if(s.charAt(i) - '0' + carry == 1){
                carry = 1;
                res ++;
            }

        }

        return res + carry;
    }
}
