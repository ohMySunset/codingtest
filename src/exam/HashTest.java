package exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashTest {

	public static void main(String[] args) {
		
		// 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
		// 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
        // 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 
		// 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
		// 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println(solution(participant, completion));
		
	}


	public static String solution(String[] participant, String[] completion) {

		Map<String, Integer> playerMap = new HashMap<>();

		for(String name : participant){
			if(playerMap.get(name) != null){
				playerMap.put(name, playerMap.get(name)+1);
			} else{
				playerMap.put(name, 1);
			}
		}

		for(String name : completion){
			if(playerMap.get(name) != null){
				playerMap.put(name, playerMap.get(name)-1);
			}
		}

		String answer = "";

		Iterator<String> keys = playerMap.keySet().iterator();

		while(keys.hasNext()){
			String key = keys.next();
			if(playerMap.get(key) != 0){
				answer = key;
			}
		}
		return answer;
	}

}
