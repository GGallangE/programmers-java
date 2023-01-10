package 입문;

public class 옹알이1 {
	public int solution(String[] babbling) {
		String[] real = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(int i =0;i<babbling.length;i++) {
        	for(int j=0;j<real.length;j++) {
        		babbling[i] = babbling[i].replace(real[j], " ");
        	}
        	if(babbling[i].replaceAll(" ", "").equals("")) answer++;
        }
        return answer;
    }
}
