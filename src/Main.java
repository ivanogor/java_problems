class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for(int i = 1; i <= n; i++){
            boolean true3 = i % 3 == 0;
            boolean true5 = i % 5 == 0;
            if(true3 && true5){
                answer.add("FizzBuzz");
            } else if(true3){
                answer.add("Fizz");
            } else if(true5){
                answer.add("Buzz");
            } else answer.add(String.valueOf(i));
        }
        return answer;
    }
}